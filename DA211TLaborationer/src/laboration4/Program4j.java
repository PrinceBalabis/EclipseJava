package laboration4;

import javax.swing.JOptionPane;

public class Program4j {
	
	private float[] askNumbers(){
		float num1 = Float.parseFloat(JOptionPane.showInputDialog("Write number 1"));
		float num2 = Float.parseFloat(JOptionPane.showInputDialog("Write number 2"));
		float[] numbers = {num1, num2};
		return numbers;
	}
	
	private float calculateSum(float[] numbers){
		return numbers[0] + numbers[1];
	}
	
	private float calculateDifference(float[] numbers){
		return numbers[0]-numbers[1];
	}
	
	private float calculateProduct(float[] numbers){
		return numbers[0]/numbers[1];
	}
	
	private void showResults(float sum, float difference, float product){
		String message = "Sum is: "+sum+"\nDifference is: "+difference+"\nProduct is: "+product;
		JOptionPane.showMessageDialog(null, message);
	}
	
	public static void main(String[]args){
		Program4j p4j = new Program4j();
		float[] numbers = p4j.askNumbers();
		float sum = p4j.calculateSum(numbers);
		float difference = p4j.calculateDifference(numbers);
		float product = p4j.calculateProduct(numbers);
		p4j.showResults(sum, difference, product);
	}
}
