package assignment;

import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor to initialize account
    public BankAccount(String name, String number, double initialBalance) {
        accountHolderName = name;
        accountNumber = number;
        balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display account details
    public void displayAccount() {
        System.out.println("\nAccount Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
}
public class BankMain {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking account details from user
	        System.out.print("Enter Account Holder Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Account Number: ");
	        String number = scanner.nextLine();

	        System.out.print("Enter Initial Balance: ");
	        double initialBalance = scanner.nextDouble();

	        // Creating bank account object
	        BankAccount account = new BankAccount(name, number, initialBalance);

	        // Deposit and Withdraw operations
	        System.out.print("Enter amount to deposit: ");
	        double depositAmount = scanner.nextDouble();
	        account.deposit(depositAmount);

	        System.out.print("Enter amount to withdraw: ");
	        double withdrawAmount = scanner.nextDouble();
	        account.withdraw(withdrawAmount);

	        // Display final account info
	        account.displayAccount();

	        scanner.close();
	    }
}
