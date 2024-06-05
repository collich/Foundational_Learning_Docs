# Big O

**Different Big Os**:

- [`O(1)`](#o1) - **Constant**: no loops.
- [`O(n)`](#on) - **Linear**: for loops, while loops through n items.
- `O(log N)` - **Logarithmic**: usually searching algorithms have log n if they are sorted (Binary Search).
- `O(n log(n))` - **Log Linear**: usually sorting operations.
- `O(n^2)` - **Quadratic**: every element in a collection needs to be compared to ever other element. Two nested loops.
- `O(2^n)` - **Exponential**: recursive algorithms that solves a problem of size N.
- `O(n!)` - **Factorial**: you are adding a loop for every element.\
**Iterating through half a collection is still O(n).**\
**Two separate collections: O(a * b).**

**What can cause time in a function?**:

- *Operations*: (`+`, `-`, `*`, `/`)
- *Comparison*: (`<`, `>`, `==`)
- *Looping*: (`for`, `while`)
- *Outside Function call*: (`function()`)

**Rule Book**:

1. Always worst Case
2. Remove Contants
3. Rules:
    - Different inputs should have different variables: `O(a + b)`
    - A and B arrays nested would be: `O(a * b)`
4. Drop Non-dominant terms

**What Causes Space Complexity?**:

- `Variables`
- `Data Structures`
- `Function Call`
- `Allocations`

> Information from `ZTM`

## Complexity Chart

![Big O Chart](../images/big_o.png)

## O(n)

It is a `Linear Time` complexity.

- Basically if `n=4`, the program will loop `4` times.
- If `n=5`, then it'll loop `5` times.

If we were to plot it in a graph, it will be linear.

`Go` Code:

```GO
// For each
for (_, item := range list){
    fmt.Println(item)
}
```

`Python` Code:

```Python
# For Loop
for i in list:
    print(i)
```

## O(1)

It's `Constant Time` complexity. Basically it's just a simple line of code.

`Go` Code:

```GO
func PrintItem(item){
    fmt.print(item)
}
```

`Python` Code:

```Python
def print_item(item):
    print(item)
```
