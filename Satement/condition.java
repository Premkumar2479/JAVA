import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number: ");
        int x = sc.nextInt();  // Corrected: nextInt(), not nextint()

        if (x % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        sc.close(); // Always good to close the scanner
    }
}
