package laboration11;

import javax.swing.JOptionPane;

public class BankAccount {
	String accountNbr;
	double balance, interestRate;
	
	public void init(String accountNbr, double balance, double interestRate){
		this.accountNbr = accountNbr;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void deposit(double amount){
		this.balance += amount;
		
	}
	
	public void withdrawal(double amount){
		this.balance -= amount;
	}
	
	public void info(){
		JOptionPane.showMessageDialog(null, "Account number: " + this.accountNbr + "\nBalance: " + this.balance);
	}
}
