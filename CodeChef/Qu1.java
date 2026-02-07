import java.util.Scanner;

class Qu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(Math.max(0, N - M));
        sc.close();
    }
}
