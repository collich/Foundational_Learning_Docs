# Array and ArrayList

## Array

To write an array in Java, you would need to just type `<Type>[]`:

```Java
int[] listInt = {1,2,3,4};
String[] listStr = {"Hello", "World"};

// Getting the length of arrays
listInt.length();

// We can also use Reference Classes
System.out.println(Array.toString(listInt));

// We can use an enhanced for loop as well.
for (int number : listInt){
    System.out.print(number);
}
```
