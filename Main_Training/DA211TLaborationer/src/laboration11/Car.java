package laboration11;

import javax.swing.JOptionPane;

public class Car {
	private String brand, model;
	private int horsepower;

	public void setBrand(String brand) {
	this.brand = brand;
	}

	public void setModel(String model) {
	this.model = model;
		
	}

	public void setHorsepower(int horsepower) {
	this.horsepower = horsepower;
	}

	public void info() {
		JOptionPane.showMessageDialog(null, "Brand: " + brand + "\nModel :" + model + "\nHorsepower: " + horsepower);
	}
}