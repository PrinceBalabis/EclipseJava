package laboration22;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NameProfession extends JPanel{
	private String name, profession;
	private JTextField txtName = new JTextField();
	private JTextField txtProfession = new JTextField();
	private JLabel lblName = new JLabel("Namn: ");
	private JLabel lblProfession = new JLabel("Yrke: ");
	
	public NameProfession(){
		setPreferredSize(new Dimension(360,60));
		txtName.setPreferredSize(new Dimension(300,20));
		txtProfession.setPreferredSize(new Dimension(300,20));
		lblName.setPreferredSize(new Dimension(50, 20));
		lblProfession.setPreferredSize(new Dimension(50,20));
		add(lblName, BorderLayout.WEST);
		add(txtName, BorderLayout.CENTER);
		add(lblProfession, BorderLayout.WEST);
		add(txtProfession, BorderLayout.CENTER);
	}
	
	public void updateNameProfession(){
		this.name = txtName.getText();
		this.profession = txtProfession.getText();
	}
	public void setName(String name){
		this.name = name;
	}
	
	public void setProfession(String profession){
		this.profession = profession;
	}
	
	public String getName(){
		return name;
	}

	public String getProfession(){
		return profession;
	}
}
