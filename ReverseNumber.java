package assignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter an integer: ");
		        int number = sc.nextInt();

		        int reversed = 0;
		        while (number != 0) {
		            int digit = number % 10;
		            reversed = reversed * 10 + digit;
		            number /= 10;
		        }

		        System.out.println("The reversed number is " + reversed);
		        sc.close();
		    }
		

	}


