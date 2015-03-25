/*
*
* Creates subclass Novel from the Book superclass with overridden
* constructor and print method.
*
*/


public class Novel extends Book {
    private int chapters;

    //override constructor for superclass Book
    public Novel(String title, int pages, int chapters) {
        super(title, pages);
        this.chapters = chapters; //adds chapters
    }

    // ovverride print method fr superclass to add chapters
    public void print() {
        super.print();
        System.out.println(" and " + chapters + " chapters");
    }

} 