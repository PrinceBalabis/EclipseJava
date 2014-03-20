package f21; 

public class Inheritance2 {
    public static void main(String[] args) {
        Person p1 = new Person("Anna Olsson");
        Person p2 = new Person();
        Employee e1 = new Employee("Olof Andersson","Eriksson",40000);
        Employee e2 = new Employee();
        e2.setName("Ola Person");
        StudentInProgram sip1 = new StudentInProgram("Lisa Eriksson", "MAH",                                                                       "Programvaruteknik", 2004);
        Student s1=new Student();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(e1.toString()); 
        System.out.println(e2.toString()); 
        System.out.println(sip1.toString());
        System.out.println(s1.toString());
     }
}
