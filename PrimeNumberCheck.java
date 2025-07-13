package assignments;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      num=sc.nextInt();
      
      if (num%2 !=0&&num%num%3!=0) {
    	  System.out.println("The number is prime");
      }
      else {
    	  System.out.println("The number is not prime");
      }
	}

}
