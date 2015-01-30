//This is a practice program designed to check a password entered, allowing for 3 attempts.

import java.util.Scanner;

public class Validate {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int attempts = 0;
        int maxAttempts = 3;
        while(attempts<3) {
            System.out.print("Enter Password: ");
            String password = input.next();
            if (checkValid(password)) {
                System.out.println("Valid Password, Welcome");
                break;
            }
            else {
                System.out.println("Invalid Password. " + "attempted " + (attempts + 1) + "/3");
                attempts++;
            }
            
            boolean maxAttemptsExceeded = attempts == maxAttempts;
            
            if(maxAttemptsExceeded) {
                System.out.println("Sorry, you have used all your password attempts.");
            }
        }
    }
    
    public static boolean checkValid(String password) {
        return (password.equals("yes"));
    }
}