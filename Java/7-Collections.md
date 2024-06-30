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

## ArrayList vs Vector

We use `Vector` if:

- We want `Thread Safe - Synchronized Methods`.
- We want almost `Constant Time - O(1)` access of an Array.

### Array List Operations

- Adding Element(s) in `ArrayList`:

```Java
ArrayList<String> listOfAnimals = new ArrayList<>();

// Add element at the end of the Array
listOfAnimals.add("Elephant");
listOfAnimals.add("Lion");
listOfAnimals.add("Fish");

// Add Element based on their index
listOfAnimals.add(1, "Dog");

// Add List to an ArrayList
List<String> newList = List.of("Yak", "Zebra");
listOfAnimals.addAll(newList);
```

- Changing Element in `ArrayList`:

```Java
listOfAnimals.set(1, "Cat");
```

- Removing Element in `ArrayList`:

```Java
listOfAnimals.remove("Fish");
listOfAnimals.remove(0);
```
