package laboration11;

import javax.swing.JOptionPane;

public class CarTest {
	String model, brand;
	int horsepower;
	
	public static void main(String[]args){
		String model = JOptionPane.showInputDialog(null, "Ange märke");
		String brand = JOptionPane.showInputDialog(null, "Ange modell");
		int horsepower = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange antalet hästkrafter"));

		Car car = new Car();
		car.setBrand(brand);
		car.setModel(model);
		car.setHorsepower(horsepower);
		car.info();
	}
}
