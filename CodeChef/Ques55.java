import java.util.Scanner;

class Ques55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (N >= 2 * X && N >= 2 * Y) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
                sc.close();

    }
}
