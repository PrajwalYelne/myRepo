
public abstract class FundTransfer {

	private String accountNumber;
	private double balance;

	boolean validate(double transfer) {
		if (getAccountNumber().length() == 10 && transfer > 0 && transfer < getBalance())
			return true;
		else
			return false;
	}

	abstract boolean transfer(double transfer);

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
