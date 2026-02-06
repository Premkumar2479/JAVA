package CodeChefJava;

import java.util.Scanner;

class Q6
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i=0; i<t; i++)
		{
    		int X = sc.nextInt();
    		int Y = sc.nextInt();
    		int A = sc.nextInt();
    		
    		// Update your code below this line solve the problem
            if(A >= X && A < Y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
		}
	}
}
