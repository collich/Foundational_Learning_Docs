# Functional Programming

---

## Collection - Stream

Stream is an ordered pipeline of aggregate operations that process a sequence of elements

Some common Methods:

- `filter()`
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
public printUsingStream(List<String> list){
    for(String item : list){
        System.out.println(item);
    }
}
```

`Stream` Implementation - print:

```Java
public printUsingLoop(List<String> list){
    list.stream().forEach(
        element -> System.out.println(element);
    );
}

```

### Filter Implementation

We can take out specific elements from the `List` using the `filter()` method.

`Loop` Implementation - filter:

```Java
public printUsingStream(List<String> list){
    for(String item : list){
        if (item.endsWith("at")){
            System.out.println(item);
        }
    }
}
```

`Stream` Implementation - print:

```Java
public printUsingLoop(List<String> list){
    list.stream()
        .filter(element -> element.endsWith("at"))
        .forEach(element -> System.out.println(element));
}
