# Lecture 6

## Arrays
is a data structure that represents a collection of the same types of data


## Declaring Arrays Reference Variables
We can use either form
- `double[] arr;`
- `double arr[];` Allowed, but not preferred

## Creating Arrays
- `arr = new double[10];` 10 is the size

## Declaring and Creating in one step
- `double[] arr = new double[10];`

## Array Length
- use `arr.length` to obtain the array size

## Default Values
- When array is created, its elements are assigned to the default value of the type
- `0` for numeric values
- `\u0000` for char type
- `false` for boolean type

## Array Initializer
- Declaring, Creating, Initializing all in one step
- This shorthand syntax must be in one statement
```java
double[] arr = {1,2.3,5.2,3.2};
```

## Enhanced `for` loop
- Introduced in JDK 1.5
- Enables the user to traverse the array sequentially without an index.
- If you wish to traverse a portion of the array or in a different order or change the elements you have to use an index
Example
```java
for(double d : arr){
    System.out.println(d);
}
```


## `code` TestingArrays
```java
public class TestingArrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            arr[i] = s.nextInt();
        }

        int max = arr[0];
        for (int i : arr) {
            if(i > max)
                max = i;
        }

        int count = 0;
        for (int i : arr) {
            if(i == max)
                count++;
        }

        System.out.println("Max is " + max + " and occurrence count is " + count);
    }
}
```

## Copying Arrays
- `=` will only copy the reference but the underlying array will be the same
- You can use for loops to copy one array to another
- Or you can use the utility method `System.arraycopy(source,src pos,target,target pos,length)`;

## Passing Arrays to Methods
- Arrays is passed by reference

## Anonymous Array
- `new int[]{1,3,5,6}` is called an anonymous array.
- it has no reference variable.
Example
```java
printArr(new int[]{1,3,5,6});
```

## `code` Passing Arrays as Arguments
```java
public class ArraysAsArgs {
    public static void main(String[] args) {
        int x = 1;
        int[] y = {1};

        increment(x,y);

        System.out.println("x = " + x);
        System.out.println("y[0] = " + y[0]);

        //array element 0 will be 2
        //while x will still be 1
    }

    public static void increment(int num,int[] arr){
        arr[0]++;
        num++;
    }
}
```

## 2D Arrays
- ``dataType[][] refVar = new dataType[SIZE_ROW][SIZE_COL]``
- using array initializer
```java
int[][] array = {
    {1,2,3},
    {4,5,6},
    {7,8,9}
};
```

## Ragged Arrays
- Each row have a different size
```java
int[][] array = {
    {1,2,3},
    {4,5},
    {7}
};
```
## nD Array
```java
double[][][][] 4dArray = new double[2][3][4][2];
```