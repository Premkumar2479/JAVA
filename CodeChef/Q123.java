// Update the '_' in the code below
import java.util.Scanner;

class Q123
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i=0; i<t; i++)
		{
            // Accept 2 integers inputs
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	// Sum of inputs
        	int s = a + b;
        	
        	// Product of inputs
        	int p = a * b;
        	
        	// Print the desired output for each test case
        	System.out.println(s + " " + p);
		}
	}
}