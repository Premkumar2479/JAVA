import java.util.*;

public class Ques42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int startCount = 0;
            int ltimeCount = 0;

            for (int i = 0; i < N; i++) {
                String code = sc.next();
                if (code.equals("START38")) {
                    startCount++;
                } else if (code.equals("LTIME108")) {
                    ltimeCount++;
                }
            }

            System.out.println(startCount + " " + ltimeCount);
        }
                    sc.close();

    }
}
