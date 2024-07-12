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

#### Things to note

When finally not execute?

Scenarios:

1. When the `if...else` clause is not executed.
2. When the `JVM` crashes.

   - The way that a JVM can crash is within the catch block, we specify `System.exit(1);`.
   - Be sure to not use `System.exit(1);` as it stops the `JVM`.

Can we not include a certain keyword?

- We cannot have just `try` block alone.
- We can have just `try` and `finally`.

### Checked vs Unchecked

When we're handling exception, we will use the `try...catch` block. Whenever we want to do an unchecked Exception, we would use the keyword `throws`.

- `Unchecked` Handling Exception:

```Java
public static void main(String[] args) throws InterruptedException{
  Thread.sleep(); // The need for InterruptedException
}
```

> Notice how we're telling Java to throw away the Exception.

- `Checked` Handling Exception:

```Java
public static void main(String[] args){
  try{
    Thread.sleep();
  } catch (Exception ex){
    ex.printStackTrace();
  }
}
```

## Exception Hierarchy

Pre-defined Java Classes:

```Java
class Error extends Throwable{} 
class Exception extends Throwable{}
class InterruptedException extends Exception{}
class RuntimeException extends Exception{}
class NullPointerException extends RuntimeException{}
```

- `Error` Class: Developers wouldn't be able to handle this but can be prevented.
- `Exception` Class: May be able to handle.
- `Checked Exception` is **risky**.

> Every subclass under `Exception`, that is not `RuntimeException`, are **Checked Exception**.

## Throwing Custom Exception

We can throw new `Exception` when we want to tell the user about a custom error.

- `Amount.java` Class:

```Java
public Amount {
  private String currency;
  private int amount;

  public Amount(String currency, int amount){
    this.currency = currency;
    this.amount = amount;
  }

  public void add(Ammount that){
    if (this.currency.equals(that.currency)){
      // Over here we're throwing a new Exception
      throw new RuntimeException("Currencies don't match!");
    }
  }

  public String toString(){
    return this.currency + " - " + this.amount;
  }
}
```

- Whenever we want to use a `Check Exception`, we would need to `throw` it:

```Java
  public void add(Ammount that) throws Exception{
    if (this.currency.equals(that.currency)){
      throw new Exception("Currencies don't match!");
    }
  }
```

### Creation of Custom Exception

We can just create a new `Class` that `extends` to the parent class `Exception`:

- New Custom Exception:

```Java
class CurrenciesDoNotMatchException extends Exception{
  public CurrenciesDoNotMatchException(String msg){
    super(msg)
  }
}
```

- Method that uses Custom Exception:

```Java
  public void add(Ammount that) throws CurrenciesDoNotMatchException{
    if (this.currency.equals(that.currency)){
      throw new CurrenciesDoNotMatchException("Currencies don't match!");
    }
  }
```

### Short hand for Try Catch - Try With Resource

We can do it by doing what is specified in the template code:

```Java
public static void main(String[] args){
  try(<Expression>){
    <Block_of_Code>
  }
}
```

Example:

```Java
public static void main(String[] args){
  try(Scanner scanner = new Scanner(System.in)){
    int[] numbers = {12, 3, 4, 5}
    int number = numbers[100];
  }
}
```

> When a class is being extended to an `AutoCloseable` Class, we can use this new `try` shorthand form.

How we can add multiple Exception is:

```Java
try{
  <code>
} catch (IOException | SQLException ex){
  ex.printStackTrace();
}
```

## Best Practices - Handling Exception

- Never Hide Exceptions.
- Do not use it for flow control.
- Think about your user.
- Think about your support team.
- Think about the calling method.
- Have global exception handling.
