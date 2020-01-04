## Identifiers
- A sequence of characters that consist of
    - letters
    - digits
    - underscores
    - dollar sign
- Can only start with a
    - letter
    - underscore
    - dollar sign
- Can't start with a digit
- Can't be a reserved word. such (true, false, class, null, else)
- Identifier can be of any length

## Declaration
```java
int x;
double r;
char a;
```

## Assignment
```java
x = 1;
r = 3.2;
a = 'B';
```

## Declaration and Assignment in one line
```java
int x = 1;
double r = 3.2;
char a = 'B';
```

## Constant
```java
final double PI = 3.14;
final int SIZE = 5;
```

## Numerical Data Types
| Name   | Range                                        | Size             |
|--------|----------------------------------------------|------------------|
| byte   | -2^7 to 2^7 - 1                              | 1 Byte (8 bits)  |
| short  | -2^15 to 2^15 - 1                            | 2 Byte (16 bits) |
| int    | -2^31 to 2^31 - 1                            | 4 Byte (32 bits) |
| long   | -2^63 to 2^63 - 1                            | 8 Byte (64 bits) |
| float  | Positive/Negative<br>1.4^-45 to 3.402...^38  | 4 Byte (32 bits) |
| double | Positive/Negative<br>4.9^-324 to 1.79...^308 | 8 Byte (64 bits) |

## Arithmetic Operators
- ``+`` Addition
- ``-`` Subtraction
- ``*`` Multiplication
- ``/`` Division
- ``%`` Remainder

## Integer Division
```java
5   / 2; // = 2
5.0 / 2; // = 2.5

5   % 2; // = 1 (remainder)
```

## ``Code`` Displaying Time
```java
public class DisplayingTime {
    public static void main(String[] args) {

        long timeMills = System.currentTimeMillis();

        long sec  = (timeMills / (1000)) % 60;
        long min  = (timeMills / (1000 * 60)) % 60;
        long hour = (timeMills / (1000 * 60 * 60)) % 24;

        System.out.println(hour+":"+min+":"+sec);
    }
}

```

## Scientific Notation
E or e can represent exponent
```java
double p = 1.2345E2;   // 1.2345 * 10^2
double n = 3.1123e-12; // 3.1123 * 10^-12
```

## ``Code`` Celsius From Fahrenheits
Can be found Sheet 1 - Question 4
```java
public class CelsiusFromFahrenheits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }

}
```

## Shortcut Assignment Operators
- ``+=`` i += 5 ⇒ i = i + 5
- ``-=`` i -= 5 ⇒ i = i - 5
- ``*=`` i *= 5 ⇒ i = i * 5
- ``/=`` i /= 5 ⇒ i = i / 5
- ``%=`` i %= 5 ⇒ i = i % 5

## Increment and Decrement Operators
- ``++var`` or ``--var``
- ``var++`` or ``var--``

## Type Conversion Rules
Java automatically converts the operands based on:
1. If one is double the other is converted to `double`
2. If one is float the other is converted to `float`
3. If one is long the other is converted to `long`
4. Otherwise both operands are converted to `int`

## Type Casting
### Implicit Casting
```java
double d = 3; // (type widening)
```
### Explicit Casting
```java
int i = (int)3.4;
```
### We can't implicitly downcast
**Downcast** is to cast from bigger data type to smaller datatype
`int x = 5 / 2.0` is wrong because the type of `5 / 2.0` is double and it can't be casted implicitly to int.
`int x = (int) (5 / 2.0)` would solve the error.

### Types Order
byte ⇐ short ⇐ int ⇐ long ⇐ float ⇐ double

## ``Code`` Keeping Two Digits After Decimal Points
```java
public class KeepingDigitsAfterPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Sales Tax:");
        double taxRate = scanner.nextDouble();
        System.out.print("Enter Price");
        double price = scanner.nextDouble();

        price = price * taxRate;

        int pr = (int) (price * 100);
        double price2Decimals = pr / 100.0;

        System.out.println("Sales Tax: " +price2Decimals);
    }
}
```

## Character Data Type
- We can assign the letter as follows `char c = 'T';` 
- We also can use the unicode number for the character `char c = '\u00A1';`
- The ++ or -- can be used to obtain the next char or the prev char

## Unicode Format
- Java uses unicode format 16 bit
- It is established by the **Unicode Consortium**
- Also Known as UTF-16
- Unicode takes 2 bytes (16 bit) (4 hex)
- From '\u0000' to '\uFFFF'
- It can represent 2^16 characters

## Escape Sequences for Special Characters
- \b Backspace
- \t Tab
- \n Linefeed
- \r Carriage Return
- \\\ Backslash
- \' Single Quote
- \" Double Quote

## ASCII Character Set
- It uses 7 bits
- Can represent 2^7 characters
- Allocates the first 128 code of the unicode from 0000 to 007f

## Casting between `char` and Numeric Types
All following statements are true
```java
int i = 'a';
int i = (int)'a';

char c = 98;
char c = (char)98;
```

## String Concatenation
We can use `+` operator to concatenate between strings
```java
String message = "Hello " + "Ya " + "M3lm";
```

## Getting Input From InputDialog
### Code
![Screen Shot 2020-01-03 at 5.50.53 PM.png](:/15854658b5424d3b8ab669fabeeaaeec)
### Result
![Screen Shot 2020-01-03 at 5.51.34 PM.png](:/526c35aee5d940baa37f61aa278431c0)

## Convert String to Integer
We use the method `parseInt` on the class `Integer` to convert a string to an int.
```java
int i = Integer.parseInt("124");
```
## Convert String to Doubles
The same goes to Double data type
```java
double d = Integer.parseInt("1.24");
```

## `Code` Computin Loan Payments

![Screen Shot 2020-01-03 at 5.55.18 PM.png](:/a49cc1370d0d45a5aaa8f1b0aec01ecf)

```java
public class ComputingLoanPayment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Interest Rate:");
        double rate = s.nextDouble();
        System.out.print("Enter Years:");
        int years = s.nextInt();
        System.out.print("Enter Loan Amount:");
        double amount = s.nextDouble();

        double result =
                (amount * rate) / (1 - (1 / Math.pow(1 + rate, years * 12)));

        System.out.println("result = " + result);
    }
}
```

## `Code` Displaying Currant Time
```java
public class DisplayingTime {
    public static void main(String[] args) {

        long timeMills = System.currentTimeMillis();

        long sec  = (timeMills / (1000)) % 60;
        long min  = (timeMills / (1000 * 60)) % 60;
        long hour = (timeMills / (1000 * 60 * 60)) % 24;

        System.out.println(hour+":"+min+":"+sec);
    }
}

```

## Getting Input Using Scanner
- Create a Scanner object
```java
Scanner scanner = new Scanner(System.in);
```
- Use the methods
    - next() => String
    - nextByte() => byte
    - nextShort() => short
    - nextInt() => int
    - nextLong() =>  long
    - nextFloat() => float
    - nextDouble() => double
    - nextBoolean() => boolean

## Programming Style and Documentation
- Appropriate Comments
    - Include a summary at the beginning of the program to explain:
        - What the program does
        - Key features
        - Supporting data structures
        - Any unique techniques used
- Naming Conventions
    - Choose meaningful and descriptive names
    - Variables and Methods names should be in camelCase
        - Compute Area should be `computeArea`
        - Radius should be `raduis`
    - Class names should be in PascalCase
        - Compute Area should be `ComputeArea`
    - Constants should be all in CAPITALIZED letters and use underscore to connect words
        - Max Value should be `MAX_VALUE`
- Proper Indentation and Spacing Lines
    - Use 2 spaces for indentation
    - Use blank line to separate segments of the code
- Block Style
