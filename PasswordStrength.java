package assignment;

import java.util.Scanner;

public class PasswordStrength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter password: ");
		        String password = sc.nextLine();

		        if (isStrong(password)) {
		            System.out.println("Password strength: Strong.");
		        } else if (isMedium(password)) {
		            System.out.println("Password strength: Medium.");
		        } else {
		            System.out.println("Password strength: Weak.");
		        }

		        sc.close();
		    }

		    public static boolean isStrong(String password) {
		        return password.length() >= 8 &&
		               password.matches(".*[A-Z].*") &&
		               password.matches(".*[a-z].*") &&
		               password.matches(".*\\d.*") &&
		               password.matches(".*[^a-zA-Z0-9].*");
		    }

		    public static boolean isMedium(String password) {
		        return password.length() >= 6 &&
		               password.matches(".*[A-Z].*") &&
		               password.matches(".*[a-z].*") &&
		               password.matches(".*\\d.*");
		    }
		

	}


