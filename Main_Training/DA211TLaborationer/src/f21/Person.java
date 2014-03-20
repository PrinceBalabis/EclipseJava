package f21; 

public class Person {
    private String name;
    
    public Person(){
        this("okänt namn");
    }
    
    public Person(String name){
        this.name=name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        return "Person: Namn = "+name;
    }
}
