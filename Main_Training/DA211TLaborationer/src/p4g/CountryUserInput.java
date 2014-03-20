package p4g;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountryUserInput extends JPanel  implements ActionListener{
    private CountryController controller;
    private JButton btnShowAll = new JButton("Visa alla länder");
    private JButton btnRead = new JButton("Hämta länder");
    private JButton btnWrite = new JButton("Spara länder");
    private JButton btnSelection = new JButton("Gör urval");
    private JButton btnChange = new JButton("Ändra");
    private JTextField tfPopulation = new JTextField();
    private JTextField tfCountry = new JTextField();
    private JTextField tfMaximum = new JTextField();
    private JTextField tfMinimum = new JTextField();

    public CountryUserInput(CountryController controller) {
        this.controller = controller;
        setLayout(new BorderLayout());

        add(panelSelection(),BorderLayout.NORTH);
        add(panelChange(),BorderLayout.CENTER);
        add(panelIO(),BorderLayout.SOUTH);
        btnShowAll.addActionListener(this);
        btnRead.addActionListener(this);
        btnWrite.addActionListener(this);
        btnSelection.addActionListener(this);
        btnChange.addActionListener(this );
    }

    /*
     * Skapar panelen i vilken användaren kan ange minsta resp största befolkning, och
     * klicka på knapparna "Gör urval" och "Visa alla länder". När panelen med komponenter
     * är färdig returneras panelen av metoden.
     */
    private JPanel panelSelection() {
        JPanel pnlSelection = new JPanel(new GridLayout(2,3,10,3));
        JLabel lblMin = new JLabel("Minimal befolkning");
        JLabel lblMax = new JLabel("Maximal befolkning");

        pnlSelection.setBorder(BorderFactory.createTitledBorder("Urval"));
        pnlSelection.setPreferredSize(new Dimension(400, 70));
        pnlSelection.add(lblMin);
        pnlSelection.add(lblMax);
        pnlSelection.add(btnShowAll);
        pnlSelection.add(tfMinimum);
        pnlSelection.add(tfMaximum);
        pnlSelection.add(btnSelection);

        return pnlSelection;
    }

    /*
     * Skapar panelen i vilken användaren kan ange ett land och ny befolkning, och
     * klicka på knappen "Ändra". När panelen med komponenter är färdig returneras
     * panelen av metoden.
     */
    private JPanel panelChange() {
        JPanel pnlChange = new JPanel(new GridLayout(2,3,10,3));
        JLabel lblCountry = new JLabel("Land");
        JLabel lblPopulation = new JLabel("Befolkning");
        pnlChange.setBorder(BorderFactory.createTitledBorder("Ändra befolkning"));
        pnlChange.setPreferredSize(new Dimension(400, 70));
        pnlChange.add(lblCountry);
        pnlChange.add(lblPopulation);
        pnlChange.add(new JLabel());
        pnlChange.add(tfCountry);
        pnlChange.add(tfPopulation);
        pnlChange.add(btnChange);

        return pnlChange;
    }
    
    private JPanel panelIO() {
        JPanel pnlIO = new JPanel(new GridLayout(1,2,10,0));
        pnlIO.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        pnlIO.add(btnRead);
        pnlIO.add(btnWrite);
        return pnlIO;
    }



	public void actionPerformed(ActionEvent e) {
	 if (e.getSource() ==btnShowAll ){
		controller.showAllCountries();
		
	
	 }
	if(e.getSource()== btnRead)	{
		 controller.loadCountries();
	}
	if(e.getSource()==btnWrite ){
		 controller.saveCountries();
	}
	if(e.getSource()==btnSelection ){
		long min = Long.parseLong(tfMinimum.getText());
		long max =Long.parseLong(tfMaximum.getText());
		controller.showSelection( min,  max);
	}
	if(e.getSource()==btnChange ){ 
		controller.changePopulation(tfCountry.getText() ,Long.parseLong( tfPopulation.getText()));
		 
}


	}
	

	

    
    // Endast för att se fönstrets utseende
//    public static void main(String args[]) {
//        CountryUserInput cui = new CountryUserInput(null);
//        cui.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        JOptionPane.showMessageDialog(null, cui);
    }

