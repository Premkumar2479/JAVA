import java.util.Scanner;

public class Ques45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cost = Math.min(1000, 200 * N);
        System.out.println(cost);
                sc.close();

    }
}
