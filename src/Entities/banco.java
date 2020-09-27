package Entities;

public class banco {

	private int accountNumber;
	private String accountHolder;
	private double balance;
	
		
	public banco(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public banco(int accountNumber, String accountHolder, double valorIni) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposito(valorIni);
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	
	public double deposito(double valor) {
		return balance += valor;
	}
	
	public double withdraw(double valor) {
		return balance -= valor + 5.00;
	}

	public String ToString() {
		return "Account"
				+ accountNumber
				+", holder:"
				+ accountHolder
				+ ", balance: $"
				+ String.format("%.2f", balance);
	}
}


