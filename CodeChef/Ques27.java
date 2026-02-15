import java.util.Scanner;

public class Ques27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a == b || c != d){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }
         sc.close();

    }
}
