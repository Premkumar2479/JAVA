import java.util.Scanner;

public class Ques34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // total pizzas
        int K = sc.nextInt(); // pizzas required
        int R = sc.nextInt(); // cost per pizza

        int remainingRevenue = (N - K) * R;
        System.out.println(remainingRevenue);

        sc.close();
    }
}
