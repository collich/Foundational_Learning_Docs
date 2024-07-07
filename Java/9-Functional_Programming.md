# Functional Programming

---

## Collection - Stream

Stream is an ordered pipeline of aggregate operations that process a sequence of elements

Some common Methods:

- `forEach()`
- `filter()`
- `reduce()`

Intermediate Operations Methods:

- `sorted()`
- `distinct()`
- `map()`

Terminal Operations Methods:

- `max`
- `min`
- `collect()`

### Implementation of Streams vs Loop

For `Streams`, there are advantages and disadvantages compared to Loop:

- **Advantages**:
  - More declarative/expressive style.
  - Encourage less mutability
  - Encourage looser coupling

- **Disadvantages**:
  - Performance compared to loop
  - Familiarity
  - Cognitive overhead
  - Debuggers

Let's say we have a List of items:

```Java
List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
```

`Loop` Implementation - print:

```Java
public printUsingLoop(List<String> list){
    for(String item : list){
        System.out.println(item);
    }
}
```

`Stream` Implementation - print:

```Java
public printUsingStream(List<String> list){
    list.stream().forEach(
        element -> System.out.println(element);
    );
}

```

> Behind the scenes of `forEach()`, it accepts a `Consumer Interface` with a method of `void accept(T t)`.

### Filter Implementation

We can take out specific elements from the `List` using the `filter()` method.

`Loop` Implementation - filter:

```Java
public printUsingLoop(List<String> list){
    for(String item : list){
        if (item.endsWith("at")){
            System.out.println(item);
        }
    }
}
```

`Stream` Implementation - filter:

```Java
public printUsingStream(List<String> list){
    list.stream()
        .filter(element -> element.endsWith("at"))
        .forEach(element -> System.out.println(element));
}
```

> Behind the `filter()`, it accepts a `Predicate Interface` which has a method of `boolean test(T t)` .

### Reduce Implementation

We can add all the numbers in the `List` by using the `reduce()` method.

```Java
List<Integer> numbers = List.of(4,6,8,13,3,15);
```

`Loop` Implementation - reduce:

```Java
public int outputUsingLoop(List<Integer> numbers){
    int sum = 0;
    for (Integer number:numbers){
        sum += number;
    }
    return sum;
}
```

`Stream` Implementation - reduce:

```Java
public int outputUsingStream(List<Integer> numbers){
    return numbers.stream().reduce(
        0, // Starting value
        (number1, number2) -> number1 + number2 // expression
        );
}
```

### Sorted Implementation

We can sort all the numbers in the list by using the `sorted` keyword.

`Stream` Implementation - sorted:

```Java
public int outputUsingStream(List<Integer> numbers){
    return numbers.stream().sorted();
}
```

### Distinct Implementation

We can find all the distinct numbers within the `List`.

```Java
List<Integer> numbers = List.of(1, 1, 2, 3, 3, 4, 5, 5);
```

`Stream` Implementation - distinct:

```Java
public int outputUsingStream(List<Integer> numbers){
    return numbers.stream().distinct();
}
```

### Map Implementation

We can do a little operations like mapping each element and doing some sort of operation in the `List`.

```Java
List<Integer> numbers = List.of(4,6,8,13,3,15);
```

`Stream` Implementation - distinct:

```Java
public int outputUsingStream(List<Integer> numbers){
    return numbers.stream().distinct().sorted().map(e -> e * e);
}
```

> Behind the scenes of `map()`, it accepts a `Function Interface` that has a method of `R apply(T t)`.

### Min-Max Implementation

We can use `min` and `max` get get either the `min` or `max` value when using streams. We would also need to create an expression for it like the `Comparator Compare()` function.

```Java
List<Integer> list = List.of(23,12,34,53);
```

- `Min`:

```Java
list.stream().min((n1,n2) -> Integer.compare(n1,n2));
// Will give Optional[12]. Will need to use the "get()" method
list.stream().min((n1,n2) -> Integer.compare(n1,n2)).get();
// 12
```

- `Max`:

```Java
list.stream().max((n1,n2) -> Integer.compare(n1,n2));
// Will give Optional[53]. Will need to use the "get()" method
list.stream().max((n1,n2) -> Integer.compare(n1,n2)).get();
// 53
```

### Collect Implmentation

We can `collect` the streamed Collections into an output by using the `collect` keyword.

```Java
List<Integer> newList = list.stream().filter(e -> e%2 != 0).collect(Collectors.toList());
```

### IntStream to Stream

If we want to create a `IntStream` object and turn it into a `Stream` object, we can use the method `boxed()`:

```Java
List<Integer> list = IntStream.range(1, 11).boxed().collect(Collectors.toList());
```

## Optional Class

It is a `Class` present to avoid `Streams` from returning a `null` value.

```Java
List.of(13, 15, 33, 67).stream().filter(e -> e%2 == 0).max((n1,n2) -> Integer.compare(n1,n2));
// Output will be Optional.empty
```

We can also assign a default value by giving it a `orElse()` method:

```Java
List.of(13, 15, 33, 67).stream().filter(e -> e%2 == 0).max((n1,n2) -> Integer.compare(n1,n2)).orElse(0);
// Output will be "0"
```
