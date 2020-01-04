## Static Variables/Methods
- Static variables/methods are shared between all instances of the class.
- Static variables/methods are not tied to a specific object.
- **`REMINDER`** non-static are tied to only one object and not shared
- to mark variable/method to be static use the `sattic` modifier
```java
class C{
    static int x;
    
    static int add(int a,int b){
        return a + b;
    }   
}
```


## Constants
- Are final variables its value cannot be changed after its assignment.
- To mark variable as constant use the `final` modifier
```java
final int MILISECONDS = 1000;
```

## `code` Using Instance and Class Variables and Method

```java
public class NumberOfCircles {

    public static class Circle{

        public double r;
        public static int numberOfObjects;

        public Circle(double r){
            numberOfObjects++;
            this.r = r;
        }

        public static int getNumberOfObjects() {
            return numberOfObjects;
        }

        public double getArea() {
            return r * r * Math.PI;
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(1.5);
        Circle c3 = new Circle(2.5);
        Circle c4 = new Circle(5.2);
        Circle c5 = new Circle(10.135);

        //should be 5
        //static method
        System.out.println(Circle.getNumberOfObjects());
        //non-static method (instance method)
        System.out.println(c1.getArea());
        
        //static variable
        System.out.println(Circle.numberOfObjects);
        //non-static variable (instance variable)
        System.out.println(c1.r);
    }
}
```

## Visibility Modifiers
- **Private** can be accessed by the declaring class
```java
private int x;
```
- **Default** can be accessed by any class in the same package
```java
int x;
```
- **Protected** can be accessed by any subclass and any class in the same package
```java
protected int x;
```
- **Public** can ba accessed by any class in any package
```java
public int x;
```

## Why Data Fields Should be Private?
- To Protect the data
- To make the class easy to maintain
```java
class Circle{
    private double r;
    
    public void setR(double r){
        this.r = r;
    }
    
    public double getR(){
        return r;
    }
}
```

## Immutable Objects
- Immutable object means the state of the object cannot be changed once the object has been created.
- The object is called Immutable Object and its class is called Immutable Class.
- Class with all private data fields and no mutators are **NOT necessarily** an immutable.
- **NOTE**
    - **Immutable** غير قابل للتغير
    - **Mutable** قابل للتغير
    - **Mutator** is a method that would change the state of the object like (setter methods)
    - **Accessor** is a method that returns data or a reference to data like (getter methods)
- For a class to be immutable
    - Mark all data fields as **private**
    - Provide **no mutators**
    - Provide **no accessor to mutable objects**.

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

## `this` keyword
- Used to refer to the object instance
- Used to invoke instance methods
- Used to refer to the instance data fields
- Used to invoke an overloaded constructor of the same class.

## Array of objects
- Array of objects is an array of reference variables

## Class Abstraction
- **Class Abstraction** means to separate class implementation from the use of the class.
- Creator of the class provide description of the class to the user and let the user know how the class should be used.
- The user of the class doesn't have to know how the class is implemented.
- Class implementation/details encapsulated and hidden from the user.


## `code` Circle/Triangle/Loan class
**Lookup sheet 7/8 Problems**

