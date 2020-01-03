## Method Abstraction
- Think of the method body as a block box that contains detailed implementation of the method, but you can only see the input and output.

## Methods
- A method is a collection of statements that are grouped together to perform an operation.
- Method signature is the combination of the method **name** and the **parameter list**
- The variables defined in the method header are known as **formal parameters.**
- When a method is invoked, you pass a value to the parameter. This value is referred to as **actual parameter or argument**
- A method may returen a value and it's specified in the method header
- A method also can return nothing in this case the reutrn type should be `void`

## `code` Calling Max
```java
public class CallingMax {

    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);

        System.out.println("Max of " + i + "," + j + " is " + k);
    }
}
```

## Reuse Code
- One of the benefits of methods is code reuse.

## Pass by value
- all primitive types are passed by value
- Reminder of primitive types:
    - byte
    - short
    - int
    - long
    - float
    - double
    - boolean
    - char

## Method Overloading
- When two methods with the same name and return type but differ in the parameter list
- Example
```java
int max(int n1,int n2){
    //------
}

int max(int n1,int n2,int n3){
    //------
}
```

## Ambiguous Invocation
- When the complier cannot deremine the most specific match.
- Ambiguous Invocation is a complilation error
- Example
```java
double max(double n1,int n2){
    //------
}

double max(int n1,double n2){
    //------
}
```

## Method Benefits
- Code Reuse - Write once and reuse it everywhere
-  Abstraction - Information hiding. Hide the implementation from the user
- Reduce Complexity


## `Math` class
- Constants
    - PI
    - E
- Methods
    - Trigonometric (uses Radians)
        - `sin(double a)`
        - `cos(double a)`
        - `tan(double a)` 
        - `acos(double a)`
        - `asin(double a)`
        - `atan(double a)`
    - Exponent
        - `exp(double a)`
        - `log(double a)`
        - `log10(double a)`
        - `pow(double a,double b)`
        - `sqrt(double a)`
    - Rounding
        - `ceil(double x)`
        - `floor(double x)`
        - `rint(double a)`
        Round the nearest integer and returns **double**
        - `round(float a)`
        Round the nearest integer and returns **int**
        - `round(double a)`
        Round the nearest integer and returns **long**
    - `min(a,b)`
    - `max(a,b)`
    - `abs(a)`
    - `random()`
    Return a random number from [0 to 1)
    
## Note on Math.random()
- To genrate from 0 to any number eg 10
```java
Math.random() * 10
```
- Also you can genrate random number between any numbers by using
```java
a + Math.random() * b // return random number between a and a+b
```

## Packages Reasons
1. Avoid naming comfilicts
2. Distribute software conveniently
3. Protect Classes


## Package Naming Convention
- Java Designers recommend that you use your internet domain name in reverse order as a package prefix
- Example `tarekma.github.io` should be `io.github.tarekkma`

## Package Directories
- Java expects one-to-one mapping of the package name and the file system directories.
- `classpath` environment variable should point to the directory where all java code resides.

## Using Packages
- to use packages and declare that a class belong to a package
    - use the `package` keyword in top of the file
    - Example `package com.tarekkma;`

## Using class from packages
- To use a class like JOptionPane you could use its fully qualified name `javax.swing.JOptionPane`
- Or you can import all classes from `javax.swing` by using `import javax.swing.*;`
- Or by importing only one single class by using `import javax.swing.JOptionPane`
