package assignments;

import java.util.Scanner;

public class PrimeNumberCheck {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            int i = 2;
            int count = 0;

            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    count++;
                    break;
                }
                i++;
            }

            if (count == 0)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }

        sc.close();
    }
}


