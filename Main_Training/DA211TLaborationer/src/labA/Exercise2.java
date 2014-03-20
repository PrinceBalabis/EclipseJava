package labA;

import java.util.*;
import javax.swing.JOptionPane;

public class Exercise2 {
    public void action() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("aldrig");
        list.add("god morgon");
        list.add("söndag");
        list.add("ballong");
        list.add("springa");
        list.add("bil");
        list.add("farmor");
        
        // skriv kod här
        String addArray;
        for(int i = 0; i<5; i++){
        	addArray = JOptionPane.showInputDialog("Skriv strängen");
        	list.add(addArray);
        }
        
        for( int i = 0; i < list.size(); i++ ) {
            System.out.println(list.get(i));
        }
    }
    
    public static void main(String[] args) {
        Exercise2 e2 = new Exercise2();
        e2.action();
    }
}
