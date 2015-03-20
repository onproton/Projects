/**
*
* Colorado State University – ITS-320 – Basic Programming 
*
* This program calculates the totals order retail amounts for a selection of 5 products and quantities entered
* as puchased. 
*
* Programmed by: Eliza Danyi
* 
* Date: October, 24 2014
*
*/

import java.util.Scanner; //scanner class import
import java.text.NumberFormat;

public class Program3 
{

	public static void main(String[] args) 
	{
		
		int productNo; //stores the product number entered
		int unitsSold; //stores the number of units sold entered
		double linePrice = 0; //stores the current total
		double totalPrice = 0; //stores the cumulative total
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		//Creates a for loop that repeats a known number of times (5) by incrementing the loop control variable "counter".
		for(int counter = 0; counter < 5; ++counter) 
		{
		
		// Get the product number.
		System.out.print("Please enter the product number >> ");
		productNo = keyboard.nextInt();

		//Validate the productNumber entry and prompt for new value if invalid (< 0 or >5).
		while(productNo <=0 || productNo > 5) 
		{
			System.out.println(productNo + " is not a valid product number. Please enter an integer between 1 and 5 >> ");
            productNo = keyboard.nextInt();
		}
		
		// Get the number of units sold.
		System.out.print("How many units sold? >> ");
		unitsSold = keyboard.nextInt();
		
		//Validate the units sold entry and prompt for new value if invalid (<0 or >5).
		while(unitsSold <=0 || unitsSold > 5) 
		{
			System.out.println(unitsSold + " is not a valid number of units. Please enter an integer between 1 and 5 >> ");
			unitsSold = keyboard.nextInt();
		}
		
		//switch that determines the price per unit for the product number entered and multiplies it by the number of units sold and sets linePrice to that value.
		switch(productNo) 
		{
		case 1:
			linePrice = unitsSold * 2.98;
			break;
		case 2:
			linePrice = unitsSold * 4.50;
			break;
		case 3:
			linePrice = unitsSold * 9.98;
			break;
		case 4:
			linePrice = unitsSold * 4.49;
			break;
		case 5:
			linePrice = unitsSold * 6.87;
			break;
		}
		
		//Prints price for the current line.
		System.out.println("The total for this line is: $" + linePrice);
		
		//Adds linePrice to total price.
		totalPrice = totalPrice + linePrice;
		
		//Prints running total.
		System.out.println("The running total for this order is: $" + totalPrice);
		
		
		
		}
		
		//Prints the final total of the 5 lines.
		System.out.println("Thank you,");
		System.out.println("The final total for this purchase is $" + totalPrice);
	}
	
}
