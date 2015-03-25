/*
*
* Creates superclass book, defines constructor and methods used by subclasses
* and LibrarySelector, unless overridden in the subclass (novel, phone, & almanac)
*
*/

public class Book {
    private String title;
    private int pages;
 
    // constructor, sets object title and page count
    public Book(String title, int pages) {
        this.title = new String(title);
        setPages(pages);
    }

    // Sets the number of pages in the book
    public void setPages(int pages) {
        this.pages = pages;
    }
 
    // method to return number of pages in the book
    public int getPages() {
        return pages;
    }
 
    // print method
    public void print() {
        System.out.println(title + " has " + pages + " pages");
    }
    
}

