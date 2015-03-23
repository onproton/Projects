/**
*
* Colorado State University – ITS-320: Java Programming
*
* This program demonstrates using the BankAccount class to simulate a bank
* account and demonstrates how its methods can be used to manipulate the object.
*
* (Adapted by Eliza Danyi from "Starting Out with Java - Early Objects
* (Third Edition) by Tony Gaddis, 2008 by Pearson Educ.)
*
*/

import java.util.Scanner;
import java.text.DecimalFormat; // decimal number formatting

public class Program2 {
    public static void main(String[] args) {
        BankAccount account;  // To reference a BankAccount object
        double balance,       // The account's starting balance
        interestRate,         // The monthly interest rate
        pay,                  // The user's pay
        cashNeeded;           // The amount of cash to withdraw

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Create an object for formatting dollars and cents
        DecimalFormat formatter = new DecimalFormat ("#0.00");

        // Prompt user for the starting balance and populate balance variable
        System.out.print("What is your account's " + "starting balance? ");
        balance = keyboard.nextDouble();
        // Prompt user for the monthly interest rate and populate interestRate variable
        System.out.print("What is your annual interest rate? ");
        interestRate = keyboard.nextDouble();
        // Create a BankAccount object 'account' with the entered balance and interestRate
        account = new BankAccount(balance, interestRate);
        // Prompt for amount of pay for the month & populate 'pay' variable
        System.out.print("How much were you paid this month? ");
        pay = keyboard.nextDouble();

        // Deposit the user's pay into the account using the deposit method of the bank acct class
        System.out.println("We will deposit " + pay + " into your account.");
        account.deposit(pay);
        // prints the balance using the getBalance method and formats it using the DecimalFormat 'formatter'
        System.out.println("Your current balance is $" + formatter.format( account.getBalance()  ));

        // Prompts user for withdraw amount
        System.out.print("How much would you like " + "to withdraw? ");
        // Populates the cashNeeded var with entered amount
        cashNeeded = keyboard.nextDouble();
        // uses the withdraw method of the bank account class to withdraw amount
        account.withdraw(cashNeeded);
		
        // Add the monthly interest to the account using the addInterest method
        account.addInterest();
        // Display the interest earned and the balance formatted in DecimalFormat
        System.out.println("This month you have earned $" + formatter.format( account.getInterest() ) + " in interest.");
        System.out.println("Now your balance is $" + formatter.format( account.getBalance() ) );
    }
}