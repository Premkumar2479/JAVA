package CodeText;


import java.util.Scanner;

public class Q2



{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    if (x > 5 && y < 10) {
        System.out.println("In Range");
    } else {
        System.out.println("Not In Range");
    }

	}
}
