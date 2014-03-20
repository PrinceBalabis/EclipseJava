package labA;
import java.util.*;
import javax.swing.*;

public class Exercise3 {
    public void action() {
        // Lägg till variabel-deklarationer här
        ArrayList<String> list = new ArrayList<String>(); 
        String res = "";
        int age = 0;
        list.add("Adil");
        list.add("Henrik");
        list.add("Sasha");
        list.add("Gökhan");
        list.add("Johnny");
        list.add("Karin");
        list.add("Abtin");
        
        for( int i = 0; i < list.size(); i++ ) {
            res += list.get(i)+"\n";
        }
        JOptionPane.showMessageDialog(null, res);
        
        // skriv kod här
        for(int i = 0; i<list.size(); i++){
        	age = Integer.parseInt(JOptionPane.showInputDialog("Vad är åldern på " + list.get(i) + "?"));
        	list.set(i, (list.get(i) + " " + age));
        }

        res = "";
        for( int i = 0; i < list.size(); i++ ) {
            res += list.get(i)+"\n";
        }
        JOptionPane.showMessageDialog(null, res);
    }
    
    public static void main(String[] args) {
        Exercise3 e3 = new Exercise3();
        e3.action();
    }
}
