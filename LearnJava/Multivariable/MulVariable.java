// Multiple Variable Declaration in Java

// In Java, you can declare multiple variables of the same data type in a single statement by separating them with commas. This makes the code more concise and readable. However, all variables declared together must share the same data type.

// Syntax:
// dataType variable1, variable2, variable3;


// You can also assign values while declaring multiple variables:

// dataType variable1 = value1, variable2 = value2, variable3 = value3;


package LearnJava.Multivariable;

public class MulVariable {
    public static void main(String[] args) {
        // Declaring multiple int variables in one line
        int x, y, z; 

        // Assigning values separately
        x = 5;
        y = 10;
        z = 15;

        // Declaring and assigning values in a single statement
        double a = 3.5, b = 7.2, c = 9.8;

        // Printing values
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }

}
