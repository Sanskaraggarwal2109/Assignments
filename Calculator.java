package assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,add,sub,mul,div;
		Scanner sc=new Scanner(System.in);

		System.out.println(" Enter Two Numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();

		add=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;

		System.out.println("Addition:"+add+"\n"+"Subtraction:"+sub+"\n"+"Multiplication:"+mul+"\n"+"Division:"+div);

	}

}
