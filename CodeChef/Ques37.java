import java.util.Scanner;

public class Ques37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // fuel units
        int Y = sc.nextInt(); // efficiency

        if (X * Y >= 100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
