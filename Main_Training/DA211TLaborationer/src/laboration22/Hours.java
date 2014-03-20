package laboration22;

public class Hours extends WageEmployee{
	double hourlyWage;
	double hours;
	
	public Hours(long id, double hourlyWage){
		super(id);
		this.hourlyWage = hourlyWage;
	}
	
	public void setHourlyWage(double hourlyWage){
		this.hourlyWage = hourlyWage;
	}
	
	public double getHourlyWage(){
		return hourlyWage;
	}
	
	public void setHours( double hours){
		this.hours = hours;
	}
	
	public double getHours(){
		return hours;
	}
	
	// returnerar (hourlyWage * hours)
	public double wage(){		
		return hourlyWage*hours;
	}
} 