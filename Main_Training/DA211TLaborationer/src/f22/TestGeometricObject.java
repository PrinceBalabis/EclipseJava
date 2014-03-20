package f22;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geo1 = new Circle( 1, 1, 1 );
        GeometricObject geo2 = new Rectangle( 1, 1 );
        System.out.println( geo1.toString() + " och har arean " + geo1.area() + " a.e." );
        System.out.println( geo2.toString() + " och har arean " + geo2.area() + " a.e" );
        System.out.println( "Skillnaden i area är " + geo1.difference(geo2) +  " a.e.");
    }
}
