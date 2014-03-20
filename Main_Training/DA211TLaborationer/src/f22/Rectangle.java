package f22;

/**
 * Klassen Rectangle beskriver ett geometriskt objekt med bredd och höjd.
 * 
 * @author Rolf Axelsson
 * @version 1.1
 */
public class Rectangle extends GeometricObject {
    // instansvariabler
    private double width;
    private double height;

    /**
     * Defaultkonstruktor som initierar bredden och höjden till 1.
     */
    public Rectangle() {
        width = 1;
        height = 1;
    }

    /**
     * Konstruktor som sätter bredden och höjden
     * 
     * @param width
     *            rektangelns bredd
     * @param height
     *            rektangelns höjd
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Returnerar rektangelns bredd
     * 
     * @return rektangelns bredd
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returnerar rektangelns höjd
     * 
     * @return rektangelns höjd
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sätter rektangelns bredd
     * 
     * @param width
     *            rektangelns nya bredd
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Sätter rektangelns höjd
     * 
     * @param height
     *            rektangelns nya höjd
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returnerar rektangelns area
     * 
     * @return rektangelns area
     */
    public double area() {
        double area = width * height;
        return area;
    }

    /**
     * Jämför två Rektangel-objekt och returnerar true om rektanglarna är lika
     * stora och annars false.
     * 
     * @param o
     *            den rektangel som denna rektangel jämförs med.
     * @return true om rektanglarna är lika stora, annars false
     */
    public boolean equals(Object o) {
        Rectangle rect;
        boolean res = false;
        if (o instanceof Rectangle) {
            rect = (Rectangle) o;
            res = ((height == rect.getHeight()) && (width == rect.getWidth()));
        }
        return res;
    }

    public String toString() {
        return "Rektangelns bredd är " + width + " l.e. och höjd är " + height
                + " l.e.";
    }
}
