package labC;
import java.io.*;

public class Commodity implements Serializable{
    private long id;
    private String name;
    private int quantity;
    private double price;

    public Commodity( long id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String toString() {
        return "Id=" + this.id + ", " + this.name + ", antal=" + this.quantity + ", pris=" + this.price;
    }
}
