package laboration22;

public abstract class WageEmployee {
	private long id;
	
	public WageEmployee( long id ) {
		this.id = id;
	}
	public long getId() {
		return this.id;
	}
	public String toString() {
		return "Id: " + this.id + ", lön denna månad: " + wage() + " kr";
	}
	public abstract double wage(); 
} 