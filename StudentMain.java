package assignment;

import java.util.Scanner;

class Student {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    // Method to get student info from user
    public void getInfo(Scanner scanner) {
        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Year of Joining: ");
        yearOfJoining = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Salary: ");
        salary = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter Address: ");
        address = scanner.nextLine();
    }

    // Method to display student info
    public void displayInfo() {
        System.out.printf("%-10s %-15d %-10.2f %-20s\n", name, yearOfJoining, salary, address);
    }
}


public class StudentMain {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        // Taking input for 3 students
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            students[i] = new Student();
            students[i].getInfo(scanner);
        }

        // Displaying the data
        System.out.println("\nName       Year of Joining  Salary      Address");
        for (Student student : students) {
            student.displayInfo();
        }

        scanner.close();
    }
}

	
