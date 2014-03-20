package labA;
import java.util.*;

public class Exercise1 {
    public void action() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("aldrig");
        list.add("god morgon");
        list.add("söndag");
        list.add("ballong");
        list.add("springa");
        list.add("bil");
        list.add("farmor");
         
        //a
        for(int i=0; i<list.size(); i++) {
            System.out.println( list.get(i) );
        }
        System.out.println("------------");
        //b
        for(int i = list.size()-1; i>-1; i--){
        	System.out.println(list.get(i));
        }
        System.out.println("------------");
        //c
        for(int i = 0; i<list.size(); i+=2){
        	System.out.println(list.get(i));
        }
        System.out.println("------------");
        //d
        for(int i = list.size()-1 ; i>=0; i-=3){
        	System.out.println(list.get(i));
        }
        System.out.println("------------");
    }
    
    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
        e1.action();
    }
}
