package f22;

/**
 * Klassen representerar en punkt med x- och y-koordinat
 * @author Rolf Axelsson
 * @version 1.1
 */

public class Point {
    //instansvariabler
    private double x;
    private double y;
    
    /**
     * En konstruktor som sätter x- och y-koordinaten.
     * @param x x-koordinaten i punkten.
     * @param y y-koordinaten i punkten.
     */
    public Point(double x,double y) {
        this.x=x;
        this.y=y;
    }
    
    /**
     * Returnerar x-koordinaten i punkten.
     * @return x-koordinaten i punkten.
     */
    public double getX(){
        return x;
    }
    
    /**
     * Returnerar y-koordinaten i punkten.
     * @return y-koordinaten i punkten.
     */
    public double getY(){
        return y;
    }
    
    /**
     * Returnerar true om Point-objekten är lika
     * @param o den punkt som denna punkt jämförs med
     * @return retunerar sant om x- och y-koordinaten är lika.
     */
    public boolean equals(Object o){
        return ( (o instanceof Point) && (x==((Point)o).getX()) && (y==((Point)o).getY()));
    }
    
    /**
     * Retunerar en beskrivning av punkten på formen "(x,y)"
     * @return en beskrivning av punkten på formen "(x,y)"
     */
    public String toString(){
        return "("+x+","+y+")";
    }
}
