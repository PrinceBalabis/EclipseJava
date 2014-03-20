package f21; 

public class Student1 extends Person1 {
    private String school;

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return this.school;
    }

    public String toString() {
        return "Skola = " + this.school;
    }
}
