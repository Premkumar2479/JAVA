import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();

        Switch(day){
            case 1 : System.out.println("Sunday");
                break;
            case 2 : System.out.println("Monday");
                break;
            case 3 : System.out.println("Tuesday");
                break;
            case 4 : System.out.println("Wednesday");
                break;
            case 5 : System.out.println("Thusday");
                break;  
            case 6 : System.err.println("Friday");
                break;
            case 7 : System.out.println("Saturady");
                break;
            default : Syatem.out.println("Invalid day");
        }
        sc.close();
    }
    
}
