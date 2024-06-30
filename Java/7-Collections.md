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

### ArrayList vs LinkedList vs Vector

We use `ArrayList` if:

- We want to access have `Constant Time - O(1)` access of the Array.

We use `LinkedList` if:

- We want faster `Insertion` and `Deletion`.

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

- Getting the `indexOf` the element:

```Java
listOfAnimals.indexOf("Yak");
```

### Iterations for ArrayList

There are multiple ways to `Iterate` around an `ArrayList`

- `(Regular) For Loop`:

```Java
for (int i = 0; i < listOfAnimals.size()>;i++){
    System.out.println(listOfAnimals.get(i));
}
```

- `(Enhanced) For Loop`.
  - **Not Recommended** to use it when there you want to make a `Modification`, especially when you want to `remove`, for the `Element`.
  - Use an `Iterator` when there is a modification.

```Java
for (String animal : listOfAnimals){
    System.out.println(animal);
}
```

- `Iterator Class`:

```Java
Iterator<String> animalIterator = listOfAnimals.iterator();

while(animalIterator.hasNext()){
    System.out.println(animalIterator.next());
}
```

- For `Collection Streams`, go look at the section on `Functional Programming & Lambda`.
