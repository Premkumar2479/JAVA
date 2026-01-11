// Write a program that checks if a given number is divisible by both 3 and 5


import java.util.Scanner;

public class Ques24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 3 ==0 && number % 5 ==0){
            System.out.println("Divides by both 3 and 5");
        }else{
            System.out.println("Does not divide by both 3 and 5");
        }
        }
    }

