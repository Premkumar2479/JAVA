import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // number of 3-pointers
        int Y = sc.nextInt(); // number of 2-pointers

        int totalScore = (3 * X) + (2 * Y);

        System.out.println(totalScore);

        sc.close();
    }
}
