package assignments;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks:");
		marks=sc.nextInt();
		
		if(marks>=90&&marks<=100) {
			System.out.println("your grade is A");
		}
		else if(marks>=80&&marks<=89) {
			System.out.println("your grade is B");
		}
		else if(marks>=70&&marks<=79) {
			System.out.println("your grade is C");
		}
		else if(marks>=60&&marks<=69) {
			System.out.println("your grade is D");
		}
		else {
			System.out.println("your grade is F");
		}
			
		
		

	}

}
