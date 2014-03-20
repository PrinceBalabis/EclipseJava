package laboration4;
import javax.swing.JOptionPane;
public class Program4e {
	
/* EX 2.6 = 15
 * EX 2.7 = 2.08
 * EX 2.8 = 1
 * 	
 */
	
	int size;
    public void size() {
size = 18;
size = size + 12;
size = size * 2;
size = size / 4;
System.out.println ("EX 2.6 answer: " + size);
}
        
	float depth;
    public void depth() {
depth = (float) (2.4);
depth = (20 - depth * 4);
depth = depth / 5;
System.out.println ("EX 2.7 answer: " + depth);
}
    
	int length;
    public void length() {
length = 5;
length *= 2;
length *= length;
length /= 100;
System.out.println ("EX 2.8 answer: " + length);
}
    
    
	 int thevariablenumber;
    		public void thevariableprogram() {
    		thevariablenumber = Integer.parseInt(JOptionPane.showInputDialog( "Enter the variable" ));
    		
    		thevariablenumber = thevariablenumber + 1;
    		thevariablenumber +=  1;
    		thevariablenumber++;
    		++thevariablenumber;

    		
    		JOptionPane.showMessageDialog( null, "EX 2.9 answer: " + thevariablenumber);
    }
    
    
    
    
    public static void main(String[] args) {
        Program4e p4v = new Program4e();
        p4v.size();
        p4v.depth();
        p4v.length();
        p4v.thevariableprogram();
    }
}
