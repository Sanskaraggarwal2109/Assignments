package assignments;

import java.util.Scanner;

public class SwapVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();

		// swaping the numbers 
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;

		System.out.println("num1="+num1+"num2="+num2);







	}

}
