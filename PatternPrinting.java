package assignment;

public class PatternPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int n = 5; // You can adjust for more/less rows

		        // Upper pyramid
		        for (int i = 1; i <= n; i++) {
		            int stars = 2 * i - 1;
		            for (int j = 1; j <= stars; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }

		        // Lower inverted pyramid
		        for (int i = n - 1; i >= 1; i--) {
		            int stars = 2 * i - 1;
		            for (int j = 1; j <= stars; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		    }
		

	}


