package assignment;

  

	
		// TODO Auto-generated method stub
		import java.util.Scanner;

		class Employee{
		    private int salary;
		    private int hoursPerDay;

		    // Method to get salary and hours
		    public void getInfo(int salary, int hoursPerDay) {
		        this.salary = salary;
		        this.hoursPerDay = hoursPerDay;
		    }

		    // Method to add $10 if salary is less than $500
		    public void addSal() {
		        if (salary < 500) {
		            salary += 10;
		        }
		    }

		    // Method to add $5 if hours of work per day > 6
		    public void addWork() {
		        if (hoursPerDay > 6) {
		            salary += 5;
		        }
		    }

		    // Method to display final salary
		    public void printFinalSalary() {
		        System.out.println("Final Salary: $" + salary);
		    }
		}

		public class EmployeeMain {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Employee emp = new Employee();

		        System.out.print("Enter salary: ");
		        int salary = scanner.nextInt();

		        System.out.print("Enter hours of work per day: ");
		        int hours = scanner.nextInt();

		        emp.getInfo(salary, hours);
		        emp.addSal();
		        emp.addWork();
		        emp.printFinalSalary();

		        scanner.close();
		    }
		

	}


