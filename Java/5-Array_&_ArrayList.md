# Array and ArrayList

---

## Array

To write an array in Java, you would need to just type `<Type>[]`:

```Java
int[] listInt = {1,2,3,4};
String[] listStr = {"Hello", "World"};

// Getting the length of arrays
listInt.length();

// We can also use Reference Classes
System.out.println(Array.toString(listInt));

// We can use an `enhanced for loop` as well.
for (int number : listInt){
    System.out.print(number);
}
```

There are a few useful methods that we can use.

```Java
// fill in an empty Array
int[] listArray = new int[5];

Arrays.fill(listArray, 100);

// Check for equality with another Array
int[] listArray1 = {100, 100, 100, 100, 100};

Array.equals(listArray, listArray1);
```

### Extra - Variable Arguments

To have a number of arguments into a method, we can use `...`.

Things to remember:

- It must be the last parameter to use `Variable Arguments`
- Arrays are not dynamic:
  - Can't add or remove elements within the Array.

```Java
void print(int... values){
  System.out.printf(Arrays.toString(values));
}
```

## ArrayList

This is just the basic of ArrayList. Will go into further details under `Collections` documentation.

```Java
// Basic way of initialising an ArrayList
ArrayList<Object> arrayList = new ArrayList<>();

arrayList.add(10);
arrayList.add("Hello");
arrayList.add(false);
```

It is recommended to use types when using `ArrayList`.

```Java
ArrayList<Integer> arrayList = new ArrayList<Integer>();

arrayList.add(10);
arrayList.add(20);
arrayList.add(30);
```
