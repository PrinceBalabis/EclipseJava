package f21; 

public class Inheritance1 {
    public static void main(String[] args) {
        Person1 person=new Person1();
        Student1 student=new Student1();
        person.setName("Klara");
        student.setName("August");
        student.setSchool("Malmö högskola");
        System.out.println(person);
        System.out.println(student);
    }
}
