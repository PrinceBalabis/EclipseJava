package laboration12;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        
        c.setRadius(23.2); // setRadius eller initiera via konstruktor
        System.out.println( "CIRKEL med radie = " + c.getRadius() ); // getRadius
        System.out.println( "CIRKEL med area = " + Math.PI * c.getRadius() * c.getRadius() );
        c.setRadius(c.getRadius()+5.7); // setRadius och getRadius, 1 el 2 rader med kod
        System.out.println( "CIRCLE, radius = " + c.getRadius() ); // toString
} }
