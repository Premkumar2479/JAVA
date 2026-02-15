import java.util.Scanner;

public class Ques40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int L = Math.max(x - y, x - z);
            int R = Math.min(x + y, x + z);

            int count = Math.max(0, R - L + 1);

            // Exclude Chef himself
            if (L <= x && x <= R) {
                count--;
            }

            System.out.println(count);
            sc.close();
        }
    }
}
