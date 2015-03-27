/*
*
* throws exception objects from their specified classes, from the superclass throwable
* if numbers meet the permaeters defined in the validate method.
*
*/

public class Verify {
    //variables to hold the perameters of ver, the minimum and maximum
    int numHigh,numLow;
	
    //constructor
    public Verify(int numLow, int numHigh) {
        this.numLow = numLow;
        this.numHigh = numHigh;
    }

    //validates that the number entered is within range, or throws exceptions
    public void validate(int number) throws NumberHighException, NumberLowException, NumberNegativeException {
        if(number > 0 && number < numLow) {
            throw new NumberLowException("NumberLowException: number < " + numLow);
        }
        if(number > numHigh) {
            throw new NumberHighException("NumberHighException: number > " + numHigh);
        }
        if(number < 0) {
            throw new NumberNegativeException("NumberNegativeException: number < 0");
		}
        if(number >= numLow && number <= numHigh) {
            System.out.println(number + " is a valid number");
        }
        
	}
	
}
