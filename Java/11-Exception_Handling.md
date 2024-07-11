# Exception Handling

---

Two Keys to Exception Handling:

- Friendly Message to end user
- Enough information to Debug the problem

## Basics of Exception

This section demonstrates the basic of exceptions.

### Stack Trace and NullPointerException

- **Stack Trace**:
  - A stack trace is a list of stack frames. These frames represent a moment during an application’s execution.
- `NullPointerException`:
  - It's when the user is trying to access a part of something that doesn't exist.

```Java
public static void main(String[] args){
    String str = null;
    str.length();
}
```

> This causes `NullPointerException`.

### Handling Exceptions

How we can handle exceptions is by using `try...catch`

```Java
public static void main(String[] args){
  method1();
}

public void method1(){
  try{
    String str = null;
    str.length();
  } catch (Exception ex) {
    ex.printStackTrace();
  }
}
```

#### Note for exception

If we were to not fill the catch with any code, the exception will be gobbled up.

```Java  
try{
  String str = null;
  str.length();
} catch (Exception ex) {}
```

> This is dangerous as we won't know the error and wouldn't have any inkling on how to handle the error.

### Exception Hierarchy and Matching

There are `Hierarchy` for `Exceptions`.

- `Exception` Class is the superclass of all exceptions.
- We can have multiple `catch` blocks and it will match to the appropriate one.

**Example 1** - `NullPointerException`:

```Java
public static void main(String[] args){
  method1();
}

public void method1(){
  try{
    String str = null;
    str.length();
  } catch (NullPointerException ex){
    System.out.println("Matched Null Pointer Exception");
    ex.printStackTrace();
  } catch (Exception ex) {
    System.out.println("Matched General Exception");
    ex.printStackTrace();
  }
}
```

> This example will get caught on the `NullPointerException` Block.

**Example 2** - `ArrayIndexOutOfBoundsException`:

```Java
public static void main(String[] args){
  method1();
}

public void method1(){
  try{
    int[] i = {1,2};
    int j = i[3];

  } catch (NullPointerException ex){
    System.out.println("Matched Null Pointer Exception");
    ex.printStackTrace();

  } catch (ArrayIndexOutOfBoundsException ex) {
    System.out.println("Matched Array Index Out of Bounds Exception");
    ex.printStackTrace();

  } catch (Exception ex) {
    System.out.println("Matched General Exception");
    ex.printStackTrace();
  }
}
```

> The `catch` block with the `ArrayIndexOutOfBoundsException` will be ran.

### Finally Block

We can catch the error and still run the code after if we need to by using the `finally` keyword.

Example if we have a `Scanner` Object and we want to close the `Scanner` as if there are too many `Scanner` Object not being close, there would be a memory leak.

```Java
public staic void main(String[] args){
  Scanner scanner = null;
  try{
    scanner = new Scanner(System.in);

    int[] numbers = {1,2,2,5};
    int viewNumber = numbers[10];
    System.out.println(viewNumber);

    scanner.close(); // This line won't execute as there is a ArrayIndexOutOfBoundsException happening on top.
  } catch (Exception ex){
    ex.printStacktrace();
  } finally {
    if (scanner != null) {
      scanner.close(); // This line will execute.
    }
  }
}

```
