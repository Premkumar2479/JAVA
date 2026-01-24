import java.util.Scanner;

public class Ques01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();

            System.out.println(a + " " + b + " " + c + " " + d + " " + e);
        }
    }
}
