/**
* Program #1
 * 
 * Function: Simple Java application to demonstrate the behavior 
 * of different data types, arithmetic, concatenation, and 
 * output of results.
 * 
 * Programmed By: Eliza Danyi (October 7, 2014)
 * for ITS320 - Basic Programming 
 * Based upon code Taken From: "Java Programming" by Joyce Farrell
 *
 */
public class Program1_Eliza 
{
	public static void main(String[] args)
	{
	int xx = 315;
	short xy = 23;
	long xz = 1234567876543L;
	int value1 = 43, value2 = 10, sum, difference,
	product, quotient, modulus;
	boolean isProgrammingFun = true;
	double doubNum1 = 2.3, doubNum2 = 14.8, doubResult;
	char myGrade = 'A', myFriendsGrade = 'C';
	System.out.println("Our grades are " + myGrade +
	" and " + myFriendsGrade);
	doubResult = doubNum1 + doubNum2;
	System.out.println("The sum of the doubles is " +
	doubResult);
	doubResult = doubNum1 * doubNum2;
	System.out.println("The product of the doubles is " +
	doubResult);
	System.out.println("The value of isProgrammingFun is " +
	isProgrammingFun);
	System.out.println("The value of isProgrammingHard is " +
	 isProgrammingFun);
	System.out.println("The int is " + xx);
	System.out.println("The short is " + xy);
	System.out.println("The long is " + xz);
	sum = value1 + value2;
	difference = value1 - value2;
	product = value1 * value2;
	quotient = value1 / value2;
	modulus = value1 % value2;
	System.out.println("Sum is " + sum);
	System.out.println("Difference is " + difference);
	System.out.println("Product is " + product);
	System.out.println("Quotient is " + quotient);
	System.out.println("Modulus is " + modulus);
	System.out.println("\nThis is on one line\nThis on another");
	System.out.println("This shows\thow\ttabs\twork");
	} // end method main
	} // end class Program1_Eliza