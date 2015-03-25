/*
*
* Creates subclass Phone from Superclass Book & specifies its attributes,
* overridden print method, and constructor format.
*
*/

public class Phone extends Book {
    private int yellowPages;   //declares variables for # of white pages & yellow pages
    private int whitePages;
    
    // override Book constructor class
    public Phone(String title, int whitePages, int yellowPages) {
        //inserts the sum of white pages & yellow pages into the superclass constructor
        super(title, whitePages+yellowPages); // utilizes part of Book constructor
        this.whitePages = whitePages; //adds the number of white and yellow pages
        this.yellowPages = yellowPages;
    }
		
    // overriding the print method of superclass Book (add printing of white/yellow pages
    public void print() {
        super.print();
        System.out.println(" with " + whitePages + " white pages");
        System.out.println(" and " + yellowPages + " yellow pages." );
    }

}