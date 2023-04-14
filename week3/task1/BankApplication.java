package week3.task1;

import java.util.ArrayList;

public class BankApplication {
	public static void main(String[] args) {

		/* CREATE FIRST BANK ACCOUNT AND TESTING ALL METHODS FOR HIM. */
		SavingAccount account1 = new SavingAccount(20, "Moaaz Suliman Saued", 0);
		account1.deposit(20);
		// NOW BALANCE IS 20
		System.out.println(account1.toString());
		account1.withdrawl(10);
		// NOW BALANCE IS 10 ==> 20 - 10 =10.
		System.out.println(account1.toString());

		// CALCUALTE INTEREST RATE FOR THIS ACCOUNT.
		double interestRate = account1.calculateInterestBalancePerYears(2);
		System.out.println("INTEREST RATE FOR THIS ACCOUNT IS " + interestRate);

		/* CREATE SECOND BANK ACCOUNT */
		SavingAccount account2 = new SavingAccount(23, "Mohamed  Suliman Saued", 0);

		/* CREATE BANK OBJECT AND PUT A LIST OF ACCOUNT IN IT. */
		ArrayList<Account> accounts = new ArrayList<>();
		accounts.add(account2);
		accounts.add(account1);
		Bank bank = new Bank(accounts);
		bank.displayBalance(account1);
		bank.deposit(2000, account1);
		System.out.println(account1.getBalance());
	}

}
