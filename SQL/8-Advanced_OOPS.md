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

## Interfaces

## 4 Pillars of OOP

### Inheritance

### Polymorphism
