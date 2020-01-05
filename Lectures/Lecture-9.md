# Lecture 9

## Are Superclass's Constructors Inherited?
- No, they are not inherited.
- They are invoked explicitly or implicitly
    - Explicitly using the keyword `super`
    - Implicitly using the superclass no-arg constructor
    
    
## Superclass constructor is always invoked
- Constructor may invoke an overloaded constructor or its superclass's constructor.
- If non is called explicitly. The comelier implicate puts `super();` as the first statement
- super() call must be the first statement in the constructor

## `super` Keyword
- Used to refer to the superclass of the instance
- Used to call superclass constructor
- Used to call superclass method/variable

## Declaring a Subclass
- using the keyword `extends`
```java
class A{}//A is superclass
class B extends A{} //B is subclass
``` 
- Subclasses extends properties and methods from the superclass
- Subclass can
    - Add new properties
    - Add new methods
    - Override methods from superclass

## Overriding methods of the superclass
- Sometimes it's necessary for the subclass to modify the implementation of a method that is defined in the superclass.
- Only accessible methods can be overridden, ie not private.
- If a private method is redefined in a subclass, the two methods are not related
- Static method can be inherited, but cannot be overridden.
- If static method is redefined the superclass method is hidden

## Accessibility Modifiers
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

## Changing Accessibility
- Subclass may strengthen the accessibility (protected -> public)
- Subclass can't weaken the accessibility (public -> protected)

# Note About Final
- final keyword can be used on local variables
```java
class C{

    int Add(int b){
        final int x = 12; //final local variable
        return b + x;
    }

}
```
- final keyword also maybe used on class to indicate that it can't be extended
```java
final class A{}
class B extends A{} // ERROR A cannot be extended
```
- final keyword used with methods to indicate that it can't be overridden

## Object Class
- Every class in java is descended from the `java.lang.Object` class.
- If no inheritance is specified, the super class is the Object class

## toString()
- toString() returns the string representation of the object.
- default implementation returns `className@objectNumber`

## equals()
- used to compare two objects
- default implementation
```java
public boolean equals(Objcet obj){
    //compares if it's the same instance of the object
    return (this == obj);
}
```


## hashCode()
- returns the hash code of the object
