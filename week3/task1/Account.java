package week3.task1;

public class Account implements AccountServices {
	private int accountNumber;
	private String holderName;
	private double balance;

	public Account() {

	}

	public Account(int accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(double price) {
		this.balance += price;
	}

	@Override
	public void withdrawl(double price) {
		this.balance -= price;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", holderName=" + holderName + ", balance=" + balance + "]";
	}

}
