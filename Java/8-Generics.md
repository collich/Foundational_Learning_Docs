# Generics

`Generics` aims to solve the problem of `Objects` only accepting to take in a certain type.

- `MyCustomList` is based on `String` type being passed in:

```Java
public class MyCustomList{
    ArrayList<String> list = new ArrayList<>();

    public void addElement(String element){
        list.add(element);
    }

    public void removeElement(String element){
        list.remove(element);
    }
}
```

- `main`:

```Java
public class GenericsRunner {
    public static void main(String[] args) {
        MyCustomList list = new MyCustomList();

        list.addElement("Element 1"); // Acceptable
        list.addElement(25); // Not Acceptable
    }
}
```

> Generics aims to solve this issue of not being able to pass in other data types.

## Implementation

To implement `Generics`, we can use `<Captital_Variable_Name>` beside the class.

```Java
public class MyCustomList<T>{
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }
}
```

- `main`:

```Java
public class GenericsRunner {
    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList();
        MyCustomList<Integer> list2 = new MyCustomList();

        list.addElement("Element 1"); // Acceptable
        list2.addElement(Integer.valueOf(25)); // Acceptable
    }
}
```

## Restrictions to certain types

To restrict to a certain type, we can use the keyword `extends`.

```Java
public class MyCustomList<T extends Number>{
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }
}
```

> `Byte`, `Double`, `Float`, `Integer`, `Long` and `Short` are all subclasses of `Number`.

- We can also use `Generics` with methods:

```Java
static <X> X returnValue(X value){
    return value;
}
```

## Wildcards

We can use the `?` keyword to specify it's a `Wildcard`:

- `Upper Bound` - use `extends`:

```Java
// Notice the method with the wild card below specifies "extends"
static Double sumOfNumberList(List<? extends Number> numbers){
    double sum = 0.0;
    for(Number number : numbers){
        sum += number.doubleValue();
    }
    return sum;
}
```

**Upperbound**: helps with implementing common logics. Which are those classes that `extends` to the extended type.

- `Lower Bound` - use `super`:

```Java
// Notice the method with the wild card below specifies "super"
static void addACoupleOfValues(List<? super Number> numbers){
    numbers.add(1);
    numbers.add(1.0);
    numbers.add(1.0f);
    numbers.add(1l);
}
```

**LowerBound**: helps with adding different values of the types which are a sub-type of the extended type.

> To understand UpperBound and LowerBound, [Watch this video](https://www.youtube.com/watch?v=o9YzJN0-AT4)
