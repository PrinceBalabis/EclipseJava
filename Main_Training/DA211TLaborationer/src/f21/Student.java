package f21; 

public class Student extends Person{
    private String school;
    
    public Student() {
        this("okänd skola");
    }
    
    public Student(String school){
        this.school=school;
    }
    
    public Student(String name,String school){
        super(name);
        this.school=school;
    }
    
    public void setSchool(String school){
        this.school=school;
    }
    
    public String getSchool(){
        return school;
    }
    
    public String toString(){
        return "Student: Namn = " + getName() + ", Skola = "+school;
    }
}
