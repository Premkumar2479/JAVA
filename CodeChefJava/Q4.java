package CodeChefJava;


import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i=0; i<t; i++)
		{
            // Accept one integer as input
    		int n = sc.nextInt();
    		
    		// 1st condition in the problem
    		if(n<=100){
    		    System.out.println("Good");
    		}
    		
    		// 2nd condition in the problem
    		else if(n>=100 && n<=200){
    		    System.out.println("Better");
    		}
    		
    		// 3rd condition in the problem
    		else{
    		    System.out.println("Best");
    		}
		}
	}
}
