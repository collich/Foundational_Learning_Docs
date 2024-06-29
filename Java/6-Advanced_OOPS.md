# Advanced OOPS

Basics of OOP:

- `Classes` are `template`
- `Instances` are `objects`
- Creating a `Class`, consider what are the:
  - `Constructor`
  - `Attributes` are `States`
  - `Methods` are `Behavior`

`Example` - Think how the consumer would consume the `Fan`:

```Java
public class Fan{
    // Attributes/States
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;

    // Constructor
    public Fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    // Methods/Behaviour
    public void switchOn(){
        this.isOn = true;
        setSpeed((byte)5);
    }

    public void switchOff(){
        this.isOn = false;
        setSpeed((byte)0);
    }

    public void setSpeed(byte speed){
        this.speed = speed;
    }

    public String toString(){
        return String.format("make - %s, radius - %f, color %s, isOn - %b, speed - %d", this.make, this.radius, this.color, this.isOn, this.speed)
    }
}
```

## Object Composition

It's basically being able to use Object Types as an `Attribute` or `State`. In this sense, it's an Object in an Object. *It describes a class that references one or more objects of other classes in instance variables*.

`Example`:

```Java
// Address Class
public class Address {
    private String line1;
    private String city;
    private String zip;
}
```

```Java
// Customer Class
public class Customer {
    // Attributes
    private String name;
    private Address homeAddress;
    private Address workAddress;

    // Constructor
    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    // Methods - Getters
    public String getName(){
        return this.name;
    }
    public Address getHomeAddress(){
        return this.homeAddress;
    }
    public Address getWorkAddress(){
        return this.workAddress;
    }

    // Methods - Setters
    public void setName(String name){
        this.name = name;
    }
    public void setHomeAddress(Address homeAddress){
        this.homeAddress = homeAddress;
    }
    public void setWorkAddress(Address workAddress){
        this.workAddress = workAddress;
    }
}
```

> Notice here that Customer class attribute references to the Address Class. We would always think about the relationship between objects in order to design Object Composition.

## Abstract Classes

Think of `Abstract Classes` like a template or a recipe. Without the ingredients, the food won't be made. Similarly, `Abstract Classes` are just templates/recipe and **Cannot** be instantiated/implemented.

We can use the keyword `abstract`.

```Java
abstract class Animal {
    abstract public void makeSound();

    public String movement(){
        return "Something is moving"
    }
}
```

> In this case, we've labeled the **class** and **method** as `abstract`. Which means we can't `instantiate` the **class** or `write any code` in the **method**.
> We would only provide the implemention, **method**, in the `Sub/Child Class`.

## Interfaces

Similar to `Abstract Classes` but a Class can implement multiple `Interface`.

`Interfaces`:

```Java
// Predator Interface
public interface Predator{
    public void hunt();
}
```

```Java
// Prey Interface
public interface Prey{
    public void flee();
}
```

`Classes`:

```Java
// Rabbit Class
public class Rabbit implements Prey{
    @Override
    public void flee(){
        System.out.println("The rabbit is fleeing.");
    }
}

// Hawk Class
public class Hawk implements Predator{
    @Override
    public void hunt(){
        System.out.println("The hawk is hunting.");
    }
}

// Fish Class
public class Fish implements Prey, Predator{
    @Override
    public void hunt(){
        System.out.println("The fish is hunting smaller fishes");
    }

    @Override
    public void flee(){
        System.out.println("The fish is fleeing the larger fish.");
    }
}

```

> Over here is an example of implementing **Rabbit**, **Hawk**, **Fish** classes using interfaces.

Think of it this way:

| Interfaces | Abstract Class |
| :-------------: | :----------------: |
| Common Methods | Common properties |

## 4 Pillars of OOP

Let's go over [Inheritance](#inheritance) and [Polymorphism](#polymorphism) for implementation.

### Inheritance

Remove duplications of code. Especially when two classes have quite similar in terms of state and behaviour. We can use this by using the `extends` keyword and by using the `super()` method when building the `child/sub class` constructor.

`Example`:

```Java
// Super/parent class: Human
public class Human{
    private String name;
    private String gender;
    private boolean isHealthy;

    public Human(String name, String gender, boolean isHealthy){
        this.name = name;
        this.gender = gender;
        this.isHealthy = isHealthy;
    }

    public String walk(int distance){
        return String.format("I'm walking %d KM.", distance);
    }
}
```

```Java
// Sub/child class: Student
public class Student extends Human{
    private String classAssign;

    public Student(String name,String gender,boolean isHealthy, String classAssign){
        // *2) Super() method 
        super(name, gender, isHealthy);
        this.classAssign = classAssign;
    }

    // 3) Method Overloading
    public Student(String name,String gender,boolean isHealthy){
        super(name, gender, isHealthy);
        this.classAssign = "1A";
    }
    public Student(String classAssign){
        this.classAssign = classAssign;
    }

    // *3) Method Overriding
    @Override
    public String walk(int distance){
        return String.format("I'm walking %d miles.", distance);
    }
}
```

> 1) `Object Class` is the root of the class hierarchy.
> 2) Using the method `super()` is the way to inherit the **Attributes** of the `Super/Parent Class`.
> 3) **Method Overloading**: A way to instantialise Objects using Classes in different ways.
> 4) **Method Overriding**: requires the `Sub/Child Class` to have the same name as the `Super/Parent Class`.

### Polymorphism
