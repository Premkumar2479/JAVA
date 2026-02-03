import java.util.Scanner;

class Q122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of test cases

        for (int i = 0; i < T; i++) {
            int X = sc.nextInt(); // distance to office

            // total distance in a week
            System.out.println(10 * X);
        }
    }
}
