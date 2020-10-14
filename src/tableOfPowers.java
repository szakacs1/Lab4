import java.util.Scanner;
public final class tableOfPowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		 String choice = "y";

	        do
	        {
	            // Get input from the user
	            System.out.print("Enter an integer: ");
	            int integer = scnr.nextInt();

	            // Create a header
	            String header = "Number  " + "Squared " + "Cubed   " + "\n"
	                        +   "======  " + "======= " + "=====   ";
	            System.out.println(header);

	            int square = 0;
	            int cube = 0;

	            String row = "";
	            for (int i = 1; i <= integer; i++)
	            {

	                square = i * i;
	                cube = i * i * i;

	                row = i + "       " + square + "       " + cube;
	                System.out.println(row);
	            }

	            // See if the user wants to continue
	            System.out.print("Continue? (y/n): ");
	            choice = scnr.next();
	            System.out.println();

	        }
	        while (!choice.equalsIgnoreCase("n"));  
	    }
	}