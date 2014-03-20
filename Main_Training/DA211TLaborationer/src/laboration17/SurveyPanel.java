package laboration17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SurveyPanel extends JPanel {
	
    // paneler
    private JPanel pnlNorth = new JPanel(new BorderLayout());
    private JPanel pnlNorthNorth = new JPanel(new BorderLayout());
    private JPanel pnlNorthCenter = new JPanel(new GridLayout(1, 2));
    private JPanel pnlAge = new JPanel(new GridLayout(5, 1));
    private JPanel pnlHobby = new JPanel(new GridLayout(5, 1));
    private JTextArea taSummary = new JTextArea();
    private JButton btnSummary = new JButton( "Sammanfattning" );
    // namn
    private JLabel lblName = new JLabel( "Namn: " );
    private JTextField tfName = new JTextField();
    // ålder
    private JRadioButton rb0_17 = new JRadioButton( "  0 - 17" );
    private JRadioButton rb18_64 = new JRadioButton( "18 - 64" );
    private JRadioButton rb65 = new JRadioButton( "65 -" );
    private ButtonGroup buttonGroup = new ButtonGroup();
    // hobby
    private JCheckBox cbSport = new JCheckBox( "Idrott" );
    private JCheckBox cbDance = new JCheckBox( "Folkdans" );
    private JCheckBox cbBirds = new JCheckBox( "Fågelskådning" );
    private JCheckBox cbBridge = new JCheckBox( "Bridge" );
    private JCheckBox cbSong = new JCheckBox( "Körsång" );
    
    public SurveyPanel() {
        setPreferredSize( new Dimension( 300, 360 ) );
        setLayout( new BorderLayout() );
        // pnlAlder
        pnlAge.setBorder( BorderFactory.createTitledBorder( "Ålder" ) );
        buttonGroup.add( rb0_17 );
        buttonGroup.add( rb18_64 );
        buttonGroup.add( rb65 );
        pnlAge.add( rb0_17 );
        pnlAge.add( rb18_64 );
        pnlAge.add( rb65 );
        rb65.setSelected(true);
        // pnlHobby
        pnlHobby.setBorder( BorderFactory.createTitledBorder( "Hobby" ) );
        pnlHobby.add( cbSport );
        pnlHobby.add( cbDance );
        pnlHobby.add( cbBirds  );
        pnlHobby.add( cbBridge );
        pnlHobby.add( cbSong  );
        //pnlNorthNorth + pnlNorthCenter
        pnlNorthNorth.add(lblName, BorderLayout.WEST);
        pnlNorthNorth.add(tfName, BorderLayout.CENTER);
        pnlNorthCenter.add(pnlAge);
        pnlNorthCenter.add(pnlHobby);
        //pnlNorth
        pnlNorth.add(pnlNorthNorth, BorderLayout.NORTH);
        pnlNorth.add(pnlNorthCenter, BorderLayout.CENTER);
        pnlNorth.add(btnSummary, BorderLayout.SOUTH);
        add( pnlNorth, BorderLayout.NORTH  );
        add( taSummary, BorderLayout.CENTER );
        //Aktiverar ActionListener
        btnSummary.addActionListener(new SummaryListener());
    }
    
    private class SummaryListener implements ActionListener{
    	public void actionPerformed(ActionEvent e){
    		summary();
    	}
    	
    	public void summary(){
    		   String res = tfName.getText() + "\n";
    	       // Lägg till korrekt ålder
    	       if( rb0_17.isSelected() )
    	           res += "Ålder: " + "0 - 17 år\n";
    	       else if( rb18_64.isSelected() )
    	           res += "Ålder: " + "18 - 64 år\n";
    	       else
    	           res += "Ålder: " + "65 - år\n";
    	       // Lägg till hobbies
    	       res += "Hobby: ";
    	       if( cbSport.isSelected() )
    	           res += " Idrott";
    	       if( cbDance.isSelected() )
    	           res += " Folkdans";
    	       if( cbBirds.isSelected() )
    	           res += " Fågelskådning";
    	       if( cbBridge.isSelected() )
    	           res += " Bridge";
    	       if( cbSong.isSelected() )
    	           res += " Körsång";
    	       res += "\n";
    	       // Visa texten i JTextArea-komponenten
    	       taSummary.setText( res );
    	}
    }
}