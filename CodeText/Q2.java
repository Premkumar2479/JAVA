package CodeText;


import java.util.Scanner;

public class Q2
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if (x > 5 && y < 10) {
        System.out.println("In Range");
    } else {
        System.out.println("Not In Range");
    }

	}
}
