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
- `Insertion` and `Deletion` are slower compared to `LinkedList`.

We use `LinkedList` if:

- We want faster `Insertion` and `Deletion`.
- Able to implement `Double LinkedList`
- `Iteration` is slower than `ArrayList`.

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
// Index of element
listOfAnimals.indexOf("Yak");
// Last Index of the elment
listOfAnimals.lastIndexOf("Yak");
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

### Sorting

The most popular for sorting a simple `ArrayList`:

```Java
ArrayList<Integer> newNumberList = new ArrayList<>(5, 31, 22, 2, 3, 69, 25);
// sort() is a static method
Collections.sort(newNumberList);
```

- If we want to sort `Objects`, we would use a `Comparable Interface`:

```Java
// Student Class
public class Student implements Comparable<Student>{
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    // Getter
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    // Setter
    public void setId(int id){
        this.id = id;
    }
    public void set(String name){
        this.name = name;
    }

    // Comparable Interface - Sorting them in Acsending order
    @Override
    public int compareTo(Student that){
        return Integer.compare(this.id, that.id);
    }
}

// In main()
void main(){
    List<Student> studentsList = List.of(new Student(1, "Thomas"), new Student(57, "Ranger"), new Student(3, "John"));
    Collections.sort(studentsList);
}
```

- To use `Ascending` or `Descending` sort, we would create their own `Class`:

- `Ascending`:

```Java
class AscComp implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2){
        return Integer.compare(student1.getId(), student2.getId());
    }
}
```

- `Descending`:

```Java
class DescComp implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2){
        return Integer.compare(student2.getId(), student1.getId());
    }
}
```

- `main` method:

```Java
void main(){
    // Sorting studentList in Ascending Order
    studentsList.sort(new AscComp());

    // Sorting studentList in Descending Order
    studentsList.sort(new DescComp());
}
```
