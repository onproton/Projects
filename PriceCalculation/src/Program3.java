/**
*
* Colorado State University – ITS-320: Java Programming
*
* This program calculates the total price for 5 items from a selection of any of 5 different products
* as specified in the switch. Demonstrates using Java while and for loops as well as switches
*
* Programmed by Eliza Danyi in 2014
*
*/

import java.util.Scanner; // scanner class import

public class Program3 {
	public static void main(String[] args) {
		int productNo; //stores the product number entered
		int unitsSold; //stores the number of units sold entered
		double linePrice = 0; //stores the current line total
		double totalPrice = 0; //stores the cumulative total
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // creates a for loop that repeats exactly 5 times by incrementing the loop control variable "counter" until >= 5
		for(int counter = 0; counter < 5; ++counter) {
		
            // Prompt for the product number and populate productNo variable
            System.out.print("Please enter the product number >> ");
            productNo = keyboard.nextInt();
            //Validate the productNumber entry and prompt for new value if invalid (< 0 or >5)
            while(productNo <=0 || productNo > 5) {
                System.out.println(productNo + " is not a valid product number. Please enter an integer between 1 and 5 >> ");
                productNo = keyboard.nextInt();
            }
            
            // Prompt for the number of units sold & populate unitsSold var
            System.out.print("How many units sold? >> ");
            unitsSold = keyboard.nextInt();
            // Validate the units sold entry and prompt for new value if invalid (<0 or >5).
            while(unitsSold <=0 || unitsSold > 5) {
                System.out.println(unitsSold + " is not a valid number of units. Please enter an integer between 1 and 5 >> ");
                unitsSold = keyboard.nextInt();
            }
		
            // switch that determines price per unit for the product number entered, multiplies it by the unitsSold, and sets linePrice
            switch(productNo) {
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
		
            // Prints the total for the current line
            System.out.println("The total for this line is: $" + linePrice);
		
            // Adds linePrice to total price.
            totalPrice = totalPrice + linePrice;
		
            // Prints running total.
            System.out.println("The running total for this order is: $" + totalPrice);
        }
		
		// Prints the final total of the 5 lines.
		System.out.println("Thank you,");
		System.out.println("The final total for this purchase is $" + totalPrice);
	}
	
}

