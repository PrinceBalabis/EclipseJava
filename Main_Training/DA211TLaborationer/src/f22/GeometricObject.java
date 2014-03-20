package f22;

public abstract class GeometricObject {
    public abstract double area();
    
    public double difference(GeometricObject geo){
        return this.area()- geo.area();
    }    
}
