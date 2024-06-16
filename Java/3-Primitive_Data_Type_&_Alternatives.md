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

## Integer Data Types

There are 2 special types that are unique to `Integer`.

- `Octal`
- `Hexadecimal`: [0-9] to [A - F]

```Java
//Octal
// Will store int 8 in variable eight
int eight = 010;

// Hexadecimal
// Will store int 16 in variable sixteen
int sixteen = 0x10;
```

## Floating Points and BigDecimal

In Java, when adding floating point value together, the result won't be accurate. To solve this, we use the class `BigDecimal`.

```Java
34.56789876 + 34.2234 // this will result 68.79129875999999

BigDecimal number1 = new BigDecimal("34.56789876");
BigDecimal number2 = new BigDecimal("34.2234");
number1.add(number2); // will result in accurate result 68.79129876
```

> In order to do operations with `BigDecimal`, you would have to create the number into `BigDecimal` as well.
