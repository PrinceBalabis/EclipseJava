package laboration22;

public class Commission extends WageEmployee{
	private double rate;
	private double sales;
	
	public Commission(long id, double rate){
		super(id);
		this.rate = rate;
	}
	
	public void setRate( double rate){
		this.rate = rate;
	}
	
	public double getRate(){
		return rate;
	}
	
	public void setSales( double sales){
		this.sales = sales;
	}
	
	public double getSales(){
		return sales;
	}
	
	// returnerar (rate * sales)
	public double wage(){
		return rate*sales;
	}
} 