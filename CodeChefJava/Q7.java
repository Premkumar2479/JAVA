package CodeChefJava;

import java.util.Scanner;

class Q7
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i=0; i<t; i++)
		{
    		int X = sc.nextInt();
    		// Update your code below this line solve the problem
    		if (X > 100) {
                System.out.println(X - 10);
            } else {
                System.out.println(X);
            }
		}
	}
}