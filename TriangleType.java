package assignments;

import java.util.Scanner;

public class TriangleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l1,l2,l3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of 3 sides:");
		l1=sc.nextInt();
		l2=sc.nextInt();
		l3=sc.nextInt();
		
		if(l1==l2&&l2==l3) {
			System.out.println("The Triangle is Equilateral");
			
		}
		else if(l1==l2||l2==l3||l1==l3) {
			System.out.println("The Triangle is Isoscles");
		}
		else {
			System.out.println("The Triangle is Scalene");
		}
	}

}
