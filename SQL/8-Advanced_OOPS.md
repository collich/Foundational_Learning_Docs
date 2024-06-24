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

## Abstract Classes

## Interfaces

## 4 Pillars of OOP

### Inheritance

### Polymorphism
