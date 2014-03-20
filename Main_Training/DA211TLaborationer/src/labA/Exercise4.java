package labA;
import java.util.*;
import javax.swing.JOptionPane;

public class Exercise4 {
    public void action() {
        String name;
        int age;
        Person p;
        ArrayList<Person> persons = new ArrayList<Person>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("Adil");
        list.add("Henrik");
        list.add("Sasha");
        list.add("Gökhan");
        list.add("Johnny");
        list.add("Karin");
        list.add("Abtin");
        
        for( int i = 0; i < list.size(); i++ ) {
            name = list.get(i);
            age = Integer.parseInt(JOptionPane.showInputDialog("Hur gammal är " + name + "?"));
            p = new Person(name,age);
            persons.add(p);
        }
        // skriv kod här
        
        for( int i = 0; i < list.size(); i++ ) {
            System.out.printf( "%-15s%-15s\n", list.get(i), persons.get(i).toString());
        }
    }
    
    public static void main(String[] args) {
        Exercise4 e4 = new Exercise4();
        e4.action();
    }
}
