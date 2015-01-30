//This is a practice program designed to check a password entered, allowing for 3 attempts.

import java.util.Scanner;


public class Validate {
	public static void main(String[] args) {

	int attempts = 1;
	while(attempts<4) {
	Scanner input = new Scanner(System.in);

		System.out.print("Enter Password: ");
		String password = input.next();

				if (checkValid(password)) {
					System.out.println("Valid Password, Welcome");
				}
				else {
					System.out.println("Invalid Password. " + "attempted " + attempts + "/3");
							attempts++;
				}

				if(attempts==4) {
						System.out.println("Sorry, you have used all your password attempts.");
				}
		}
	}

	public static boolean checkValid(String password) {
				if (password.equals("yes")) {
					return true;
				}
				else {
					return false;
				}
	}
}
