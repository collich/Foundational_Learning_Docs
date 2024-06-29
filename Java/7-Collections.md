# Collections

- Compared to primitive types, in `Collections` the method to get the length of the `List` for example is using the method `size()`.

## List

Overview:

- `Ordered` Collection.
- Allows `duplicate` elements.

```Java
// Initialise a List
List<String> words = List.of("Apple", "Bar", "Cat");

// Get the Size of the List.
words.size();
```

> If we use `List` with a method of `of()`. It is immutable. To have a `List` with mutability, we will use `ArrayList`, `LinkedList` or `Vector` Class instead.

### ArrayList vs LinkedList

We use `ArrayList` if:

- We want to access have `Constant Time - O(1)` access of the Array.

We use `LinkedList` if:

- We want faster `Insertion` and `Deletion`.
