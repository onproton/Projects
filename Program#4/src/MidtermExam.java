/**
*
* Colorado State University – ITS-320 – Basic Programming 
*
* This program creates an array of 25 integers and prints the array on  
* 5 separate lines, 5 elements per line. 
*
* Programmed by: Eliza Danyi
* 
* Date: October, 30 2014
*
*/


public class MidtermExam {
    public static int[] numbers; //declares the numbers array.
	
    public static void main(String[] args) {
        
        //allocate space for the numbers array with room for 25 int values
        numbers = new int[25];
        //for loop to initialize values 1-25 into the numbers array,
        for(int i = 0; i <25; i++) {
            numbers[i] = i + 1;    //i increments up to 25 (but does not include 25).
        }
        
        printNumbers();   //calls the printNumbers method to print the array on 5 lines
    }
	
    public static void printNumbers() {  //this is the method that defines how to print the array
        int i;   //declares local variable i
    	   
        for(i = 1; i <= 25; i++) {  //for loop incrementing i up to 25
            if (i % 5 != 0) {  //determines if i is divisible by 5
                //if i is not divisible by 5, print element with index i-1, followed by a comma
                System.out.print(numbers[i-1]+","); }
            else {
                //if i is divisible by 5, print the element with index i-1, followed by a new line
                System.out.println(numbers[i-1]); }
        }
    }
}

