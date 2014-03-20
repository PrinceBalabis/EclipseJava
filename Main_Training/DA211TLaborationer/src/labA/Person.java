package labA;

public class Person {
    private String name;
    private int age;
    
    /**
     * Skapar ett person-objekt med bifogat namn och ålder
     * @param name personens namn
     * @param age personens ålder
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /**
     * Returnerar personens namn
     * @return personens namn
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returnerar personens ålder
     * @return personens ålder
     */
    public int getAge() {
        return age;
    }
    
    public String toString() {
        return name + " " + age;
    }
}
