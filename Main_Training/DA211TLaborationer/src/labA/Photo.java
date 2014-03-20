package labA;

public class Photo {
    public static final int OTHER=0, FAMILY=1, GRANDCHILD=2, TRAVEL=3;
    private String title;
    private int year;
    private int category;
    private String filename;

    public Photo(String title, int year, int category, String filename) {
        this.title = title;
        this.year = year;
        if( (category<OTHER) || (category>TRAVEL) )
            category = OTHER;
        this.category = category;
        this.filename = filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
 
    public String getTitle() {
        return title;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getCategory() {
        return category;
    }
    
    public String getFilename() {
        return filename;
    }
    
    public String toString() {
        return "Motiv: " + title + "  Årtal: " + year;
    }    
}
