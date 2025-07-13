package assignments;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float weight,height,bmi;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your weight in kg and height in meters:");
		weight=sc.nextFloat();
		height=sc.nextFloat();

		bmi=weight/(height*height);

		System.out.println("Body Mass Index:"+bmi);



	}

}
