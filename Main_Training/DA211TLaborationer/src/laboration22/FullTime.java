package laboration22;

public  class FullTime extends WageEmployee{
	double wage;
	
	public FullTime(long id, double wage){
		super(id);
		this.wage = wage;
	}
	
	public void setWage(double wage){
		this.wage = wage;
	}
	
	public double getWage(){
		return wage;
	}
	
	public double wage(){
		 return wage;
	}
} 