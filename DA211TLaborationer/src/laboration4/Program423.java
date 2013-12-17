package laboration4;

import javax.swing.JOptionPane;

public class Program423 {

	private int[] inputNumbers(){
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv tal 1."));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Skriv tal 2"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Skriv tal 3"));
		int[] numbers = {num1, num2, num3};
		return numbers;
		
	}
	
	private int calculateAverage(int[] numbers){
		int averageNumber = ((numbers[0] + numbers[1] + numbers[2])/3);
		return averageNumber;
	}
	
	private void showAverageNumber(int averageNumber, int[] numbers){
		String message = "Average number of "+numbers[0]+", "+numbers[1]+" and "+numbers[2]+" is "+ averageNumber;
		JOptionPane.showMessageDialog(null, message);
	}
	
	public static void main(String[] args){
		Program423 p4i = new Program423();
		int[] numbers = p4i.inputNumbers();
		int averageNumber = p4i.calculateAverage(numbers);
		p4i.showAverageNumber(averageNumber, numbers);
	}
}
