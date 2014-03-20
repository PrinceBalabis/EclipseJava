package laboration12;

import javax.swing.JOptionPane;

public class BankAccount {
	String accountNbr;
	double balance, interestRate;
	
	public BankAccount(String accountNbr){
		this.accountNbr = accountNbr;
	}
	
	public BankAccount(String accountNbr, double balance, double interestRate){
		this.accountNbr = accountNbr;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public String getAccountNbr(){
		return accountNbr;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getInterestRate(){
		return interestRate;
	}
	
	public void setInterestRate(double interestRate){
		this.interestRate = interestRate;
	}
	
	public void deposit(double deposit){
		this.balance += deposit;
	}
	
	public void withdrawal(double withdrawal){
		this.balance -= withdrawal;
	}
	
	public void info(){
		JOptionPane.showMessageDialog(null, "Account number: "+accountNbr+"\nBalance: "+balance);
	}
}
