# All about OOP

---

## What is an OOP?

It's about thinking in terms of programming in an Object Oriented Paradigm.

What the objects have:

- `Attributes` or `Data`: The data or information of the object. Example `:=` names, address, contact number.
- `Methods` or `Actions`: The actions or ability of the object. Example `:=` fly(), swim(), run(), walk()

## Creating a Java Object

Creating an object class is simple:

```Java
public class Human{
    private String name;
    private int age;
    private int contact;
    private String thoughts;

    // Constructor
    public Human(name, age, contact){
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    // Method Overloading
    public Human(name){
        this.name = name;
    }

    private void think(){
        this.thoughts = "I would like to eat pasta today!";
    }

    public void walk(String location){
        think();
        System.out.printf("I'm walking to %s.\n", location);
    }

    // Getter Methods
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getContact(){
        return this.contact;
    }

    // Setter Method
    public void setName(String newName){
        this.name = newName;
    }

    public void setContact(String newContact){
        this.contact = newContact;
    }
}
```

To use this class of object we would have to instantiate it:

```Java
public class App{
    public static void main(String[] args){
        Human littleJohnny = new Human("Little Johnny", 69420, 123456789);

        littleJohnny.walk("Pasta shop");
    }
}
```

## Abstraction and Encapsulation

`Abstration` hides the layers of complexity to the user while `Encapsulation` is a concept that wraps all the `attributes` and `methods` within the class into an object to make it easier to use.

To fully utilise them, use `Getter` and `Setter` methods.

`Getter`:

```Java
//Getter Methods
public String getName(){
    return this.name;
}

public int getAge(){
    return this.age;
}
```

`Setter`:

```Java
//Getter Methods
public void setName(String newName){
    this.name = newName;
}

public void setContact(String newContact){
    this.contact = newContact;
}
```

## Constructor

`Constructor` is a way for initialising an Object with attributes.

```Java
public class Human {
    private String name;
    private int age;
    private int contact;

    // Constructor
    public Human(name, age, contact){
        this.name = name;
        this.age = age;
        this.contact = contact;
    }
}
```
