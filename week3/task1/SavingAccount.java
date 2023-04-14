package week3.task1;

public class SavingAccount extends Account {

	private final double INTEREST_RATE = 0.02;
	
	public SavingAccount(int i, String string, int j) {
		super(i, string, j);
	}

	public double calculateInterestBalancePerYears(int years) {
		return super.getBalance() * years * INTEREST_RATE;
	}

}
