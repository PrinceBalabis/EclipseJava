package laboration11;

public class Employee {

	private String name, employer;
	private double wage;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setEmployer(String employer){
		this.employer = employer;
	}
	
	public void setWage(int wage){
		this.wage = wage;
	}
	
	public void info(){
		System.out.println("Namn: " + this.name);
		System.out.println("Arbetar hos: " + this.employer);
		System.out.println("Lön: " + this.wage);
		
	}
}
