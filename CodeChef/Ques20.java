import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // charge for first hour
        int Y = sc.nextInt(); // charge per extra hour
        int H = sc.nextInt(); // total hours parked

        int totalCost;
        if (H == 1) {
            totalCost = X;
        } else {
            totalCost = X + (H - 1) * Y;
        }

        System.out.println(totalCost);
        sc.close();
    }
}
