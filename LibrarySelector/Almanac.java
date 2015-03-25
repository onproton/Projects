/*
 *
 * Creates subclass almanac that extends superclass Book,
 * overrides constructor and print methods, adds charts
 *
 */

public class Almanac extends Book {
    private int charts;
 
    // override constructor, adds charts
    public Almanac(String title, int pages, int charts) {
        super(title, pages);
        setCharts(charts);
    }
    
    // ensures charts will never be more than pages, returns false if so
    public boolean setCharts(int charts) {
        // checks # charts vs # pages from getPages method
        if(charts > getPages()) {
            System.err.println("Too many charts");
            return false; }
        else {
            this.charts = charts;
            return true; }
    }
    
    // returns charts from above
    public int getCharts() {
        return charts;
    }
    
    public void print() {  // overrides Book print method, add charts
        super.print();
        System.out.println(" and " + charts + " charts");
    }

}  