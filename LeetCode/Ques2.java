// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

// Example 1:

// Input: x = 2.00000, n = 10
// Output: 1024.00000
// Example 2:

// Input: x = 2.10000, n = 3
// Output: 9.26100



public class Ques2 {

    // Power function
    public static double myPow(double x, int n) {
        long power = n;
        double result = 1.0;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        while (power > 0) {
            if (power % 2 == 1) {
                result *= x;
            }
            x *= x;
            power /= 2;
        }

        return result;
    }

    // MAIN METHOD (REQUIRED)
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));   // 1024.0
        System.out.println(myPow(2.10000, 3));    // 9.261
        System.out.println(myPow(2.00000, -2));   // 0.25
    }
}
