package Practice;

import java.util.Scanner;

public class Perimetersquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();

        int perimeter = 4 * side;

        System.out.println("Perimeter of Square : "   +   perimeter);
        sc.close();
    }
}
