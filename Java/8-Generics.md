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
