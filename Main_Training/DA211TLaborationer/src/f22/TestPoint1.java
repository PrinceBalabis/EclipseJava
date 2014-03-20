package f22;

public class TestPoint1 {
    public static void main(String[] args) {
        Point1 p1 = new Point1(10.2, 2.4);
        Point1 p2 = new Point1(10.2, 2.4);
        Point1 p3 = p1;
        
        System.out.println( p1 + "\n" + p2 + "\nSamma: " + p1.equals(p2) );
        System.out.println( p1 + "\n" + p3 + "\nSamma: " + p1.equals(p3) );
    }
}
