package p4;
import javax.swing.*;

public class CountryMain {
    public static void showFrame( JPanel panel, int x, int y, String title, boolean resizable ) {
        JFrame frame = new JFrame( title );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setLocation( x, y );
        frame.setResizable( resizable );
        frame.add( panel );
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater( new Runnable() {
            public void run() {
                CountryViewer viewer = new CountryViewer();
                CountryIO io = new CountryIO( "src/p4/befolkning.txt" ); // anpassas!
                CountryController controller = new CountryController( viewer, io );
                CountryUserInput user = new CountryUserInput( controller );
                
                CountryMain.showFrame( user, 50, 50, "CountryUserInput", false );
                CountryMain.showFrame( viewer, 500, 50, "CountryViewer", true );
            }
        });
    }
}
