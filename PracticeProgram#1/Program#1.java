 /**
 *
 * Program #1 - practice with variables, arithmetic, and concatenation
 * 
 * Function: Simple Java application to demonstrate the behavior 
 * of different data types, arithmetic, concatenation, and 
 * output of results.
 *
 * Eliza Danyi - ITS320: Java Programming 2014
 * Based upon code From: "Java Programming" by Joyce Farrell
 *
 */

public class Program1_Eliza {
    public static void main(String[] args) {
        
        // variables for performing functions and arithmetic operations
        int xx = 315;
        short xy = 23;
        long xz = 1234567876543L;
        int value1 = 43, value2 = 10, sum, difference, product, quotient, modulus;
        boolean isProgrammingFun = true;
        double doubNum1 = 2.3, doubNum2 = 14.8, doubResult;
        char myGrade = 'A', myFriendsGrade = 'C';
        
        // prints the char values of the variables 'myGrade' and 'myFriendsGrade'
        System.out.println("Our grades are " + myGrade + " and " + myFriendsGrade);
        // stores the result of the sum of doubNum1 and doubNum2 in a new variable, 'doubResult'
        doubResult = doubNum1 + doubNum2;
        // prints out the value of the variable defined on the line above, 'doubResult'
        System.out.println("The sum of the doubles is " + doubResult);
        // sets the doubResult variable as the product of doubNum1 and doubNum2 instead of the sum
        doubResult = doubNum1 * doubNum2;
        
        // prints out the current value of the variables
        System.out.println("The product of the doubles is " + doubResult);
        System.out.println("The value of isProgrammingFun is " + isProgrammingFun);
        System.out.println("The value of isProgrammingHard is " + isProgrammingFun);
        System.out.println("The int is " + xx);
        System.out.println("The short is " + xy);
        System.out.println("The long is " + xz);
        
        // performs arithmetic on variables stored in value1 and value 2 and stores the
        // result in the corresponding variables
        sum = value1 + value2;
        difference = value1 - value2;
        product = value1 * value2;
        quotient = value1 / value2;
        modulus = value1 % value2;

        // prints out the values of the variables used in the arithmetic operations
        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + difference);
        System.out.println("Product is " + product);
        System.out.println("Quotient is " + quotient);
        System.out.println("Modulus is " + modulus);
        System.out.println("\nThis is on one line\nThis on another"); // newline
        System.out.println("This shows\thow\ttabs\twork"); //tabbing
        
    }
}
