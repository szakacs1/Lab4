import java.util.Scanner;

public class labFourWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String decision = "y";
		int squared = 0;
		int cubed = 0;
		System.out.println("Learn your squares and cubes!");
		do {
			System.out.println("Enter a number: ");
			int integer = scnr.nextInt();

			String category = "Number  " + "Squared " + "  Cubed   " + "\n" + "======  " + "======= " + "  =====   ";
			System.out.println(category);

			String row = "";
			for (int i = 1; i <= integer; i++) {

				squared = i * i;
				cubed = i * i * i;

				row = i + "       " + squared + "         " + cubed;
				System.out.println(row);
			}
			System.out.print("Continue? (y/n): ");
			decision = scnr.next();
			System.out.println();

		} while (!decision.equalsIgnoreCase("n"));
		System.out.println("Goodbye!");
		scnr.close();
	}

}
