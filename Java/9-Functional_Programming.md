# Functional Programming

---

## Collection - Stream

Stream is an ordered pipeline of aggregate operations that process a sequence of elements

Some common Methods:

- `filter()`
- `reduce()`
- `map()`
- `forEach()`
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
    int sum = numbers.stream().reduce(
        0, // Starting value
        (number1, number2) -> number1 + number2 // expression
        );
    return sum;
}
```
