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
