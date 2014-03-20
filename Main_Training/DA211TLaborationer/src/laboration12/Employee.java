package laboration12;

public class Employee {
	String name, employer;
	double wage;
	
	public Employee(String name, String employer, double wage){
		this.name = name;
		this.employer = employer;
		this.wage = wage;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setEmployer(String employer){
		this.employer = employer;
	}
	
	public void setWage(double wage){
		this.wage = wage;
	}

	public String getName(){
		return name;
	}
	
	public String getEmployer(){
		return employer;
	}
	
	public double getWage(){
		return wage;
	}
	
	public String toString(){
		return "EMPLOYEE: name = "+name+", employer = "+employer+", wage = "+wage;
	}
}
