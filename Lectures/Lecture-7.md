## OOP
- **OOP** is object oriented programming and it involves programming using objects
- **Object** representation of an entity in the real world that can be distinctly identified
- **Object Examples** Desk, Car, Button, or Loan.
- **Object has**  
    - Identity
    - State
    - Behaviors
- **State Of an Object** defines the object and it is the data fields/properties with their current values
- **Behavior of an Object** defines it can do and it is defined be its set of methods
- **Class** is a construct that define objects of the same type

## Classes
- **Class** is a construct that define objects of the same type
- **Constructor** a special type of method which is used to construct and object and initialize it from the definition of the class.
- **UML Diagrams** is used to visualize the class

## Class Constructors
- Constructors have the same name sa the class and have no return type not even void.
- Constructors are called using the `new` operator.
```java
new TestClass(); // calling the constructor with no-args
new TestClass(3); // calling the constructor with int parameter
``` 
- **no-args constructor** is a constructor with no parameters.
```java
class TestClass{
    TestClass(){ // no-arg constructor
    }   
    TestClass(int i){ // constructor with int parameter
    }   
}
```
- **Default Constructor** when no constructor is defined a no-arg constructor with an empty body is implicitly declared.
```java
class Account{
    //in this example no constructor is defined
    //and the default constructor is provided
}
```

## Object Reference Variables
```java
Account account; //declaring a object ref var
// of type account

account = new Account(); // creating an object and 
// assigning to the reference variable

Account account = new Account(); // in a single step
```

## Accessing Objects
- use `.` dot to reference object data or invoke methods.
```java
account.balance;  //access data
account.Cloase(); //invoking methods
```

## `code` Simple Circle Class
```java
public class SimpleCircleClass {
    public static class Circle{

        public double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }
    }


    public static void main(String[] args) {
        Circle circle;
        circle = new Circle(1);
        
        double area = circle.getArea();

        System.out.println("area = " + area);
    }
}
```

## Static
- You need to create an object from a class before you invoke any methods.
- `non-static` need to be called using an object
- while `static` can be called using the class
```java
//random is static
Math.random(); //called on the Math class

Circle c = new Circle(2); 
//getArea is non-static
c.getArea(); //called on the object
```

## Passing Objects
- Objects are passed by reference
- **`REMINDER`** Arrays are passed by reference
- **`REMINDER`** Primitives are passed by value
    - char
    - byte
    - short
    - int
    - long
    - float
    - double
    - boolean

## Garbage Collection
- When an object is no longer referenced by any reference variable, java marks the object as garbage.
- Garbage is automatically collected by the JVM
- If you know that the object is no longer needed, you can set it to null.

## Date Class
- A system-independent encapsulation of data and time.
- Can be found on `java.util` package.
```java
Date d1 = new Date(); // new Date object for the currant time. 
Date d2 = new Date(213132); // new Date using milliseconds.

// return the string representation of the date
d2.toString(); 

// return 
d1.toTime();
```