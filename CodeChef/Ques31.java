import java.util.Scanner;

class Ques31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int remaining = N - (A * B);
        System.out.println(remaining);
    }
}
