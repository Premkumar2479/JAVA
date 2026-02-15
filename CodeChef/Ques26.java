import java.util.Scanner;

public class Ques26 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x>5 && y<10){
            System.out.println("in Range");
        }else{
            System.out.println("out of Range");
        }
                scanner.close();

    }
}
