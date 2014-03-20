package laboration21;

public class Uppgift1b {
	public static void main(String[] args){
	Book media = new Book();
	media.setId( 837884976 );
	media.setTitle( "En fantastisk värld" );
	String res = media.getTitle()+ "\n" + 
	"toString-metoden: " + "\n" +
	media.toString();
	javax.swing.JOptionPane.showMessageDialog( null, res );
	}
}
