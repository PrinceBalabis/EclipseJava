package laboration12;
/**
 * Programmet använder ett objekt av typen Circle. Men på felaktigt sätt.
 * Rätta till felen i programmet.
 * @author Rolf Axelsson
 */
public class CircleTest12b2 {
    public static void main(String[] args) {
        Circle12b2 c = new Circle12b2();
        c.setRadius(23.2); // setRadius eller initiera via konstruktor
        System.out.println( "CIRKEL med radie = " + c.getRadius() ); // getRadius
        System.out.println( "CIRKEL med area = " + Math.PI * c.getRadius() * c.getRadius() );
// båda understrykningarna och lite till kan ersättas med area
        c.setRadius(c.getRadius() + 5.7); // setRadius och getRadius, 1 el 2 rader med kod
        System.out.println( "CIRCLE, radius = " + c.getRadius() ); // toString
} }