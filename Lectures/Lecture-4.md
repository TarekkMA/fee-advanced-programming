## Control the repetition of statements
- while
```java
while(/*Loop continuation condition*/){
    //body
}
```
- do-while
```java
do{
    //body
}while(/*Loop continuation condition*/);
```
- for loop
```java
for(
/*Initial Action*/              ;
/*Loop continuation condition*/ ;
/*Action After each iteration*/                  
){
    //body
}
```

## Omitted `for` Condition
- The loop continuation condition for `for(;;)` is implicitly true.
- `for(;;)` is equivalent to `while(true)`

## `for` Initial Action 
- It can be list of zero or more statements seprated by comma


## `Code` Advanced math Learning Tool
We use the code for the Improved Math Learning Tool but add small adjustments
```java
/*psudo code*/
int correct = 0;
for(int i = 0; i<10 ; i++){
    //prev code
    if(correct){
        correct++;
    }
}
// output the result
```
The full code
```java
public class AdvancedMathLearningTool {
    public static void main(String[] args) {
        Random r = new Random();

        int correct = 0;

        for (int i = 0; i < 10; i++) {
            int n1 = r.nextInt(10);
            int n2 = r.nextInt(10);
            int temp;


            if (n2 > n1) {
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
            if (intResult == n1 - n2) {
                correct++;
                JOptionPane.showMessageDialog(
                        null,
                        n1 + " - " + n2 + " = " + intResult + " is true",
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        n1 + " - " + n2 + " = " + intResult + " is false",
                        "Result",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "Number of correct answers is " + correct,
                "Result",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
```

## Floating point and Equality
- Don't use floating point in equality since they are approximation.

Examples of Floating point issue
```java
double data = Math.pow(Math.sqrt(2),2) - 2;
if(data == 0) System.out.println("Data Is Zero");
else System.out.println("Data Not Zero");

// The result will not be zero
```

## `Code` UsingForLoops
```java
public class UsingForLoops {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 0.01;i <= 1; i += 0.01){
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## `Code` Nested Loops
```java
public class NestedLoops {
    public static void main(String[] args) {
        String message = "";
        message += "Multiplication Table\n";
        message += "---------------------\n";

        message += " |";
        for (int i = 1; i < 10; i++) {
            message += "\t"+i;
        }
        message += "\n";

        for (int i = 1; i < 10; i++) {
            message += i +"|";
            for (int j = 1; j < 10; j++) {
                message += "\t" + i * j;
            }
            message += "\n";
        }

        JOptionPane.showMessageDialog(
                null,
                message,
                "Multiplication Table",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
```

## `Code` Find the GCD
```java
public class GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int gcd = 1;

        for (int i = 2; i <= n1 && i <= n2; i++) {
            if(n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD is " + gcd);
    }
}
```