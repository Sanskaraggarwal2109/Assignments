package assignments;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num1,num2,num3;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter 3 numbers:");
      num1=sc.nextInt();
      num2=sc.nextInt();
      num3=sc.nextInt();
      
      if(num1>=num2&&num1>=num3) {
    	  System.out.println(num1+"is the greatest");
      }
      else if(num2>=num1&&num2>=num3) {
    	  System.out.println(num2+"is the greatest");
      }
      else if (num3>=num1&&num3>=num2) {
    	  System.out.println(num3+"is the greatest");
      }
	}

}
