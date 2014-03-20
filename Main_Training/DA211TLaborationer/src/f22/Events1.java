package f22;
import java.awt.*;       // Container, Color
import javax.swing.*;    // JFrame, JPanel, JLabel, JButton, BorderFactory
import java.awt.event.*; // ActionListener, MouseListener
import java.util.Random;

public class Events1 extends JPanel implements ActionListener, MouseListener {
    private Random rand = new Random();
    private JPanel panel = new JPanel( new GridLayout(3,1) ); 
    private JLabel text = new JLabel( "Mitt namn är Rolf" );
    private JButton btnCyan = new JButton( "Ljusblå" );
    private JButton btnMagenta = new JButton( "Lila" );
    private JButton btnExit = new JButton( "Avsluta" );

    public Events1() {
        setPreferredSize(new Dimension(400,300));
        text.setPreferredSize(new Dimension(200,30));
        text.setBorder( BorderFactory.createLineBorder( Color.red ) );
        btnCyan.setBackground( Color.CYAN );
        btnMagenta.setBackground( Color.MAGENTA );
        
        text.addMouseListener( this );
        btnCyan.addActionListener( this );
        btnMagenta.addActionListener( this );
        btnExit.addActionListener( this );
        
        panel.setBorder( BorderFactory.createRaisedBevelBorder() );
        panel.add( btnCyan );
        panel.add( btnExit );
        panel.add( btnMagenta );
        
        add( text );
        add( panel );
    }
    

    public void actionPerformed(ActionEvent e) {
        if( e.getSource() == btnCyan ) {
            text.setForeground( Color.CYAN );
        } else if ( e.getSource() == btnMagenta ) {
            text.setForeground( Color.MAGENTA );
        } else if( e.getSource() == btnExit ) {
            System.exit( 0 );
        }
    }

    public void mouseClicked(MouseEvent arg0) {}

    public void mouseEntered(MouseEvent arg0) {
        int colorIndex = rand.nextInt(5);
        Color color = null;
        switch( colorIndex ) {
            case 0 : color = Color.RED; break; 
            case 1 : color = Color.BLUE; break; 
            case 2 : color = Color.GREEN; break; 
            case 3 : color = Color.YELLOW; break; 
            case 4 : color = Color.PINK; break; 
        }
        text.setForeground( color );
    }

    public void mouseExited(MouseEvent arg0) {
        text.setText( "Mitt namn är Rolf" );
        text.setForeground( Color.BLACK );
    }

    public void mousePressed(MouseEvent arg0) {
        text.setText( "Du pressar mig" );
    }

    public void mouseReleased(MouseEvent arg0) {
        text.setText( "Jag är fri!!!" );
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Program med panel"); 
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new Events1());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
