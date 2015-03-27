/**
*
* This program ensures that a number entered falls within a set of perameters,
* by catching exceptions that are thrown by the Verify.valid method
*
*/

import java.util.*; 

public class ExceptionCatching {

	public static void main(String[] args) {
        //instantiate a Verify object with a range of 10 to 100.
        Verify ver = new Verify(10, 100);
        
        //Prompt the user to input a number within the specified range.
        System.out.print("Input a number between 10-100 >>");
        Scanner keyboard = new Scanner(System.in);
      
        try {
        	//Use a Scanner to read the user input as an int.
        	int aNumber = keyboard.nextInt(); 
            //Call the validate method to validate that the number is within the range.
            ver.validate(aNumber);
        } 
        
        catch (NumberNegativeException exc) {
            //Print an appropriate error message if the value is negative,
            System.out.println(exc.getMessage());
            
        } catch (NumberLowException exc) {
            //Print an appropriate error message if the value is too low,
            System.out.println(exc.getMessage());
            
        } catch (NumberHighException exc) {
            //Print an appropriate error message if the value is too high,
            System.out.println(exc.getMessage());
 
        } catch (InputMismatchException exc) {
            //Print an appropriate error message if the value is not an int,
            System.out.println("You entered a non digit");
        }
	}
    
}
		
	
	


