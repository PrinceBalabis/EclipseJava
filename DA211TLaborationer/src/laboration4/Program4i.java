package laboration4;

import javax.swing.JOptionPane;

public class Program4i {
	
	private String readName(){
		return JOptionPane.showInputDialog("Ange ditt namn.");
	}
	
	private int askAge(){
		return Integer.parseInt(JOptionPane.showInputDialog("Ange din ålder."));
	}
	
	private int askThisYear(){
		return Integer.parseInt(JOptionPane.showInputDialog("Ange nuvarande år."));
	}
	
	private int calculate100Age(int age, int thisYear){
		int calc = 100-age;
		calc = thisYear+calc;
		return calc;
	}
	
	private void showMessage(String name, int calculatedAge){
		String message = name+", år "+calculatedAge+" fyller du 100 år!";
		JOptionPane.showMessageDialog(null, message);
	}
	
	public static void main(String[] args){
		Program4i p4i = new Program4i();
		String name = p4i.readName();
		int age = p4i.askAge();
		int thisYear = p4i.askThisYear();
		int calculatedAge = p4i.calculate100Age(age, thisYear);
		p4i.showMessage(name, calculatedAge);
	}
}
