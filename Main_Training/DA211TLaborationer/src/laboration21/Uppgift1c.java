package laboration21;

public class Uppgift1c {
	public static void main(String[] args){
		Book media = new Book();
		media.setId( 837884976 );
		media.setTitle( "En fantastisk värld" );
		media.setAuthor( "Alice Green" );
		String res = media.getTitle() + " av " + media.getAuthor() 
		+ "\n" + "toString-metoden: " + media.toString();
		javax.swing.JOptionPane.showMessageDialog( null, res );
	}
}
