
public class RTGSTransfer extends FundTransfer {

	protected double balance;

	RTGSTransfer(String accountNumber, double balance) {
		setAccountNumber(accountNumber);
		setBalance(balance);
	}

	@Override
	boolean transfer(double transfer) {
		balance = getBalance();
		// double total = transfer + (0.02 * transfer);
		if (transfer > 10000.00) {
			balance = balance - transfer;
			setBalance(balance);
			return true;
		} else
			return false;
	}

}
