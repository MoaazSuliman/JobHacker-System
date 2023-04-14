package week3.task1;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts;

	public Bank() {

	}

	public Bank(List<Account> accounts) {
		this.accounts = accounts;
	}

	public void addAccount(Account account) {
		if (accounts == null)
			this.accounts = new ArrayList<>();
		accounts.add(account);
	}

	public void removeAccount(Account account) {
		if (this.accounts.contains(account))
			this.accounts.remove(account);
	}

	public String displayBalance(Account account) {
		return "The Balane For This Account Is = " + account.getBalance();
	}

	public void deposit(double price, Account account) {
		account.deposit(price);
	}

	public void withdrawl(double price, Account account) {
		account.withdrawl(price);
	}
}
