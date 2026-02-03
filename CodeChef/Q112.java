import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of test cases

        for (int i = 0; i < T; i++) {
            int X = sc.nextInt(); // prize for top 10
            int Y = sc.nextInt(); // prize for rank 11 to 100

            // total prize money
            int total = (10 * X) + (90 * Y);

            System.out.println(total);
        }
    }
}
