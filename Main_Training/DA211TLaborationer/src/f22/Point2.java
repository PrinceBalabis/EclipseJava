package f22;

/**
 * Ett Point2-objekt beskriver en position i ett plan. Positionen
 * (x-koordinat,y-koordinat) anges vid konstruktionen och kan inte ändras.
 * @author Rolf Axelsson
 */

public class Point2 {
    private double x;
    private double y;
    
    /**
     * En konstruktor som sätter x- och y-koordinaten i punkten.
     * @param x x-koordinaten i punkten.
     * @param y y-koordinaten i punkten.
     */
    public Point2(double x,double y) {
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
     * Returnerar om punkterna är lika
     * @param obj den punkt som denna punkt jämförs med
     * @return retunerar sant om x och y koordinaten är lika.
     */
    public boolean equals(Object obj){
        Point2 aPoint;
        if( obj instanceof Point2 ) {
            aPoint = (Point2) obj;
            if ( (x==aPoint.getX()) && (y==aPoint.getY()) )
                return true;  
        }
        return false;
    }
    
    // Variant 2 av equals
//    public boolean equals(Object obj){
//        Point2 aPoint;
//        if( obj instanceof Point2 ) {
//            aPoint = (Point2) obj;
//            return (x==aPoint.getX()) && (y==aPoint.getY());
//        }
//        return false;
//    }
    
    // Variant 3 av equals
//    public boolean equals(Object obj){
//        return ( obj instanceof Point2 ) && 
//               ( (x == ((Point2)obj).getX()) && (y == ((Point2)obj).getY()) ); 
//    }

    /**
     * Retunerar en beskrivning av punkten
     * @return en beskrivning av punkten
     */
    public String toString(){
        return "("+x+", "+y+") ";
    }
}
