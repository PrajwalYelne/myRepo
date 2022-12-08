
public class IMPSTransfer extends FundTransfer {

	protected double balance;

	IMPSTransfer(String accountNumber, double balance) {
		setAccountNumber(accountNumber);
		setBalance(balance);
	}

	@Override
	public boolean transfer(double transfer) {
		balance = getBalance();
		double total = transfer + (0.02 * transfer);
		if (total < balance) {
			balance = balance - (transfer + (0.02 * transfer));
			setBalance(balance);
			return true;
		} else
			return false;
	}

}

