package assignments;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ,even,odd;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();

		if(num % 2==0) {
			System.out.println(num+" is a even number");

		}
		else {
			System.out.println(num+" is a odd number");
		}

	}}
