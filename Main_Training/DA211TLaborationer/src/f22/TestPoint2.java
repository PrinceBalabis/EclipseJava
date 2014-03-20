package f22;

public class TestPoint2 {
    public static void main(String[] args) {
        Point2 p1 = new Point2(10.2, 2.4);
        Point2 p2 = new Point2(10.2, 2.4);
        Point2 p3 = p1;
        
        System.out.println( p1 + "\n" + p2 + "\nSamma: " + p1.equals(p2) );
        System.out.println( p1 + "\n" + p3 + "\nSamma: " + p1.equals(p3) );
    }
}
