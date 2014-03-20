package laboration12;

public class Circle12b1 {
	
    public double radius;
    
    public Circle12b1() {
        this.radius = 1.0;
    }
    public Circle12b1( double inRadius ) {
        this.radius = inRadius;
    }
    public void setRadius( double inRadius ) {
        this.radius = inRadius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double area() {
    	double area = Math.PI * this.radius * this.radius; return area;
    }
    public String toString() {
        return "CIRCLE, radius = " + this.radius;
    } 
}