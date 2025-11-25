# References

In Java, objects are always accessed by there references. <br>
Here the variable "arr" is effectively a reference to the object maze. <br>
We should not expect a new copy, because there is no "new" keyword or deep copy code.

Java is always pass by value.
1. Primitives: Fully pass by value
2. Objects: We always pass a <u>reference value</u>. HOWEVER, it's a copy of reference. Therefore pass by value.<br> 


Similar to C, we see that a 2d array is an array of references to more arrays. It's still an object.

*ALL OBJECTS LIVE ON THE HEAP*


```java
    public void print_maze() {
        char [][] arr = this.maze;
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x]);
            }
            System.out.println();
        }
    }
```

# Running Files
Remember, you cannot run a file without
```java
public static void main(String[] args)
```

# Args

In Java, arg[0] IS NOT the programs own filename, unlike C.
