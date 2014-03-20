package f21; 

public class StudentInProgram extends Student{
    private String program;
    private int year;
    
    public StudentInProgram() {
        program="okänt program";
        year=0;
    }
    
    public StudentInProgram(String name, String school, String program, int year){
        super(name,school);
        this.program=program;
        this.year=year;
    }
    
    public String getProgram(){
        return program;
    }
    
    public void setProgram(String program){
        this.program=program;
        
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int year){
        this.year=year;
    }
}
