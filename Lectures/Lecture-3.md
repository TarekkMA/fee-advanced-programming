# Lecture 3

## Comparison Operators
- `<` 
- `<=` 
- `>` 
- `>=`
- `==`
- `!=`

## Boolean Operators
- `!` Not
- `&&` and
- `||` or
- `^` xor

## `Code` Determining Leap Year
```java
public class DeterminingLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Leap Year");
        }else {
            System.out.println("Normal Year");
        }
    }
}
```
## `Code` SimpleMathLearning
```java
public class SimpleMathLearning {
    public static void main(String[] args) {
        Random r = new Random();

        int n1 = r.nextInt(10);
        int n2 = r.nextInt(10);

        String result = JOptionPane.showInputDialog(
                null,
                "What is the result of " + n1 + " + " + n2 + " ?",
                "Math Learning Tool",
                JOptionPane.QUESTION_MESSAGE
        );

        int intResult = Integer.parseInt(result);
        if(intResult == n1 + n2){
            JOptionPane.showMessageDialog(
                    null,
                    n1 + " + " + n2 + " = " + intResult + " is true",
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }else{
            JOptionPane.showMessageDialog(
                    null,
                    n1 + " + " + n2 + " = " + intResult + " is false",
                    "Result",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
```

## Selection Statements
- `if` statements
- `switch` statements
- Conditional Operators

## `Code` Improved Math Learning Tool
```java
public class ImprovedMathLearningTool {
    public static void main(String[] args) {
        Random r = new Random();

        int n1 = r.nextInt(10);
        int n2 = r.nextInt(10);
        int temp;


        if(n2 > n1){
            //swap
            temp = n1;
            n1 = n2;
            n2 = temp;
        }

        String result = JOptionPane.showInputDialog(
                null,
                "What is the result of " + n1 + " - " + n2 + " ?",
                "Math Learning Tool",
                JOptionPane.QUESTION_MESSAGE
        );

        int intResult = Integer.parseInt(result);
        if(intResult == n1 - n2){
            JOptionPane.showMessageDialog(
                    null,
                    n1 + " - " + n2 + " = " + intResult + " is true",
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }else{
            JOptionPane.showMessageDialog(
                    null,
                    n1 + " - " + n2 + " = " + intResult + " is false",
                    "Result",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
```