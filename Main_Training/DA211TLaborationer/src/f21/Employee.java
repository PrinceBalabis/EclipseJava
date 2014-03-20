package f21; 

public class Employee extends Person{
    private String employer;
    private double wage;

    public Employee() {
        employer="okänd arbetsgivare";
        wage=0;
    }

    public Employee(String name,String employer, double wage){
        super(name);
        this.employer=employer;
        this.wage=wage;
    }
    
    public void setEmployer(String employer){
        this.employer=employer;
    }
    
    public String getEmployer(){
        return employer;
    }
    
    public void setWage(double wage){
        this.wage=wage;
    }
    public double getWage(){
        return wage;
    }
}
