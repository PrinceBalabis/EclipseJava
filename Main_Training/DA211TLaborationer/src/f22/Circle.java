package f22;

/**
 * Klassen representerar en cirkel med mittpunkt. 
 * @author Rolf Axelsson
 * @version 1.0
 */

public class Circle extends GeometricObject {
    //instansvariabler
    private double radius;
    private Point centre;
    /**
     * Defaultkonstruktor som sätter radien till 0 och mittpunkten till (0,0)
     */
    public Circle() {
        radius = 0;
        centre = new Point(0,0);
    }
    /**
     * Konstruktor som sätter radien och mittpunkten
     * @param radius cirkelns radie
     * @param x mittpunktens x-koordinat
     * @param y mittpunktens y koordinat
     */
    
    public Circle(double radius, double x, double y) {
        this.radius = radius;
        centre = new Point(x,y);
    }
    /**
     * Returnerar cirkelns radie
     * @return cirkelns radie
     */
    public double getRadius(){
        return radius;
    }
    /**
     * Returnerar cirkelns mittpunkt av typen Point
     * @return cirkelns mittpunkt
     */
    public Point getCentre(){
        return centre;
    }
    /**
     * Sätter cirkelns radie
     * @param radius cirkelns nya radie
     */
    public void setRadie(double radius){
        this.radius=radius;
    }
    /**
     * Sätter en ny mittPunkt med x och y koordinater.
     * @param x x-koordinaten på cirkelns mittpunkt
     * @param y y-koordinaten på cirkelns mittpunkt
     */
    public void setCentre(double x, double y){
        centre = new Point(x,y);
    }
    /**
     * Retunerar cirkelns area
     * @return cirkelns area
     */
    public double area(){
        double area;
        area = Math.PI*radius*radius;
        return area;
    }
    
    /**
     * Retunerar true om cirklarna har samma radie och samma mittpunkt 
     * @param o den cirkel som denna cirkel ska jämföras med.
     * @return true om cirklarna är samma, annars false
     */
    public boolean equals(Object o){
        Circle circle;
        boolean res = false;
        if (o instanceof Circle) {
            circle = (Circle)o;
            // true om radierna är lika och mittpunkterna är samma
            res = (radius == circle.getRadius()) && centre.equals(circle.getCentre());
        }
        return res;
    }
    
    public String toString(){
        return "Cirkeln har radien "+radius+" l.e. och mittpunkten: "+centre.toString();
    }
}
