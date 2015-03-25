/**
*
* This class creates 4 book objects with subclasses from superclass Book + various subclasses
* and prints their attributes. Practice with arrays, class inheritance, and method types
*
* Eliza Danyi, November 2014
*
*/


public class LibrarySelector {
    
    public static void main(String[] args) {
        Book [] library = new Book [5]; // New array
        // Create 4 objects w/i Book superclass + diff subclasses, & populate the array
        library[0] = new Novel("Jaws", 300, 15);
        library[1] = new Almanac("New World ", 100, 50);
        library[2] = new Novel("Animal Farm", 250, 9);
        library[3] = new Phone("Colorado State Phone Directory", 500, 100);
        listBooks(library);
    }
    
    //method to print out the array populated with the Book objects above
    static void listBooks(Book [] library) {
        for (int i = 0; i < library.length && library[i] != null; i++)
            library[i].print();
    }
}
