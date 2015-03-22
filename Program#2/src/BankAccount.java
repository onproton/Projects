/**
 *
 * BankAccount class
 * This class simulates a bank account and includes functions for
 * withdrawing, depositing, adding interest, and returnning values
 * of the account balance and interest amounts to methods in program #2
 *
 * Eliza Danyi - ITS320: Java Programming - 2014
 * (Taken/adapted from from "Starting Out with Java - Early Objects
 * (Third Edition) by Tony Gaddis, 2008 by Pearson Educ.)
 *
 */

public class BankAccount {
	private double balance;    // Account balance
	private double interestRate; // Interest rate
	private double interest;   // Interest earned
	/**
	 * The constructor initializes the balance
	 * and interestRate fields with the values
	 * passed to startBalance and intRate. The
	 * interest field is assigned to 0.0.
	 */
	public BankAccount(double startBalance, double intRate) {
		balance = startBalance;
        //to get monthlyRate, the annual rate input, intRate is divided
        //by 12 months and the result is then divided by 100 to return a %.
		double monthlyRate = (intRate/12)/100;
        
        //this sets interestRate to the calculated monthly rate above.
        interestRate = monthlyRate;
		interest = 0.0;
	}
	// The deposit method adds the parameter amount to the balance field.
	public void deposit(double amount) {
		balance += amount;
	}
	// The withdraw method subtracts the parameter amount from the balance field.
	public void withdraw(double amount) {
		balance -= amount;
	}
	// The addInterest method adds the interest for the month to the balance field.
	public void addInterest() {
		interest = balance * interestRate;
		balance += interest;
	}
	// The getBalance method returns the value in the balance field.
	public double getBalance() {
		return balance;
	}
	// The getInterest method returns the value in the interest field.
	public double getInterest() {
		return interest;
	}
}
