import java.util.*;

public class Ques41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum1 = 0, sum2 = 0;
        int maxLead = 0;
        int winner = 0;

        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();

            sum1 += s;
            sum2 += t;

            int lead;
            if (sum1 > sum2) {
                lead = sum1 - sum2;
                if (lead > maxLead) {
                    maxLead = lead;
                    winner = 1;
                }
            } else {
                lead = sum2 - sum1;
                if (lead > maxLead) {
                    maxLead = lead;
                    winner = 2;
                }
            }
        }

        System.out.println(winner + " " + maxLead);
    }
}
