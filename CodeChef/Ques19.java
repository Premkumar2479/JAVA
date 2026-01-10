import java.util.Scanner;

public class Ques19 {
    public static void main(String[] srgs){
    Scanner scanner = new Scanner(System.in);
    int R = scanner.nextInt();
    int C = scanner.nextInt();
    int E = scanner.nextInt();
    int totalcells =((R+E)*C);
    System.out.println(totalcells);
    scanner.close();
    }
}
