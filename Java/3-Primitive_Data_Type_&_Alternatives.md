# Primitive Data Type and Alternatives

## Primitive Data Type in Java

- `Integer`:
  - `byte`: **8 bit** - From **-128 to 127**
  - `short`: **16 bit** - From **-32,768 to 32,767**
  - `int`: **32 bit** - From **$-2^{31}$ to $2^{31}- 1$**
  - `long`: **64 bit** - From **$-2^{63}$ to $2^{63}- 1$**
- `Floating Point`:
  - `float`: Single Precision - **32 bit**
  - `double`: Double Precision - **64 bit**
- `Boolean`:
  - `boolean`: **true** or **false**
- `Character`:
  - `char`: **16 bit** Unicode

## Type Casting

It is important to note that there is a difference between `Explicit` and `Implicit` Type Casting.

- `Explicit Casting`: You would write out the type to convert. Usually done when you want to convert the type from **`larger type`** to **`smaller type`**.
- `Implicit Casting`: You don't have to specify the type conversion.

`Example`:

```Java
long l = 50000;
int i;

// Explicit from long to int. Big to small.
i = (int) l

// Implicit from int to long. Small to big.
l = i
```
