package CodeChefJava;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            // Read integer N for each test case
            int N = sc.nextInt();
            
            // Output the negation of N
            System.out.println(-N);
        }
        
        sc.close();
    }
}
