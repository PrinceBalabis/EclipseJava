package laboration21;

public class Uppgift1a {
	public static void main(String[] args){
		Media media = new Media();
		media.setId( 837884976 );
		media.setTitle( "En fantastisk värld" );
		String res = media.getTitle() + "\n" + "toString-metoden: " + "\n" + media.toString();
		javax.swing.JOptionPane.showMessageDialog( null, res );
	}
}
