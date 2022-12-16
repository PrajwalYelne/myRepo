
public class NEFTTransfer extends FundTransfer {

	protected double balance;

	NEFTTransfer(String accountNumber, double balance) {
		setAccountNumber(accountNumber);
		setBalance(balance);
	}

	@Override
	boolean transfer(double transfer) {
		balance = getBalance();
		double total = transfer + (0.05 * transfer);
		if (total < balance) {
			balance = balance - (transfer + (0.05 * transfer));
			setBalance(balance);
			return true;
		} else
			return false;
	}

}
