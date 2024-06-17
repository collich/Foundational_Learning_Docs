# Reference Types

Any class that is created by you is a reference type. Java have some of the pre-defined reference tclass like `String`, `Wrapper`, `BigDecimal`...etc.

## How are Reference Types stored in memory

All new objects are stored in the `Heap`. It is globally shared/stored.

```Java
new Animal("dog");
```

`Primitive` and `Reference` varialbe will be stored in the `Stack`.

```Java
Animal cat = new Animal("cat");
```

> The variable `cat` is being referenced/pointed to the heap object.

## String Reference class

String is immutable by default.

Some useful methods for `String` class:

- `String.join("",i)`: Changes from `Arrays` to `String`
- `i.split("")`: Splits the `String` into `Arrays`

### StringBuffer and StringBuilder

Since Strings are immutable, we can use `StringBuilder` or `StringBuilder` to do changes in our `Strings`.

`StringBuffer` is a synchronise class, this means it's ready for multi-threading. Use `StringBuffer` when you want to use *multi-thread*.

`StringBuilder` is much better for *single-thread*.

## Wrapper Classes

- A `Wrapper Class` wraps (encloses) around a data type and gives it an object appearance
- `Wrapper Classes` are final and immutable.

Types:

- `Wrapper`: Boolean, Byte, Character, Double, Float, Integer, Long, Short
- `Primitive`: boolean, byte, character, double, float, integer, long, short

`Wrapper Classes` offers more **utility** to the standard `Primitive` types.

```Java
Integer thousand = new Interger(1000);
Integer hundred = Integer.valueOf("100");
Boolean value = Boolean.valueOf(true);
Boolean result = Boolean.valueOf("False");


// Utility Methods
Float floatWrapper = Float.valueOf(57.0f);
int floatToInt = floatWrapper.intValue();//57

Integer seven = Integer.valueOf("111", 2);// Binary of 7
Integer.toString(seven, 2);
```

> Important note on `valueOf`. It's typically recommended to use the `valueOf` method as Java tries to **reuse** the object in memory where as `new Object` will create a new object in memory. for example:

```Java
Integer i1 = new Integer(5);
Integer i2 = new Integer(5);
Integer i3 = Integer.valueOf(5);
Integer i4 = Integer.valueOf(5);

i1 == i2;// false
i3 == i4;// true
```

### Autoboxing

```Java
Integer seven = Integer.valueOf(7);
Integer sevenAgain = 7; // Same as Integer.valueOf. Auto boxing.

seven == sevenAgain;// true
```
