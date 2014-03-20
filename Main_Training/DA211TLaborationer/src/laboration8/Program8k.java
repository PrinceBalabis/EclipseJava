package laboration8;
import javax.swing.*;

public class Program8k {
   public void customer() {
      double price, fromCustomer, back;
      boolean member;
      System.out.println("1");
      price = Double.parseDouble( JOptionPane.showInputDialog("Ange varans pris") );
      fromCustomer = Double.parseDouble( JOptionPane.showInputDialog("Hur mycket betalar kunden?") );
      
      // medlem får värdet true vid klick på 'Ja', och false vid klick på 'Nej' / stängning av dialog
      member = JOptionPane.showConfirmDialog( null, "Är kunden medlem?", "MEDLEM", JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION;
      
System.out.println("2");

      if (price >= 10000) {
             price = 0.9 * price;
             System.out.println("3");
      } else if (price >= 5000) {
             price = 0.95 * price;
             System.out.println("4");
      }
System.out.println("5");
      // om medlem så ska nytt pris beräknas här: price = 0.9 * price; // 10% rabatt
      if (member == true) {
    	  price *= 0.9; 
      }
      back = fromCustomer-price;
      JOptionPane.showMessageDialog( null, "Pengar tillbaka: " + back + " kr" );
      System.out.println("6");
   }

   public static void main(String[] args) {
      Program8e p8e = new Program8e();
      p8e.customer();
   }
}
