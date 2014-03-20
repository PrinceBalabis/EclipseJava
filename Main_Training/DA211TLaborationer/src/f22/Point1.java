package f22;
/**
 * Ett Point1-objekt beskriver en position i ett plan. Positionen
 * (x-koordinat,y-koordinat) anges vid konstruktionen och kan inte ändras.
 * @author Rolf Axelsson
 */

public class Point1 {
    private double x;
    private double y;
    
    /**
     * En konstruktor som sätter x- och y-koordinaten i punkten.
     * @param x x-koordinaten i punkten.
     * @param y y-koordinaten i punkten.
     */
    public Point1(double x,double y) {
        this.x=x;
        this.y=y;
    }
    
    /**
     * Retunerar x-koordinaten i punkten.
     * @return x-koordinaten i punkten.
     */
    public double getX(){
        return x;
    }
    
    /**
     * Retunerar y-koordinaten i punkten.
     * @return y-koordinaten i punkten.
     */
    public double getY(){
        return y;
    }
    
    /**
     * Retunerar en beskrivning av punkten
     * @return en beskrivning av punkten
     */
    public String toString(){
        return "("+x+", "+y+") ";
    }
}
