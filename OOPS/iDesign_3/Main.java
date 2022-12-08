// Main.java
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number:");
		String accNo = sc.next();
		System.out.println("Enter the balance of the account:");
		double balance = sc.nextDouble();
		System.out.println("Enter the type of transfer to be made:\r\n" + "1.NEFT\r\n" + "2.IMPS\r\n" + "3.RTGS");
		int choice = sc.nextInt();
		if (choice == 1) {
			NEFTTransfer neft = new NEFTTransfer(accNo, balance);
			System.out.println("Enter the amount to be transferred:");
			double transfer = sc.nextDouble();
			if (neft.validate(transfer) == true)
				if (neft.transfer(transfer) == true) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is " + neft.getBalance());
				} else
					System.out.println("Transfer could not be made");
			else
				System.out.println("Account number or transfer amount seems to be wrong");
		}
		if (choice == 2) {
			IMPSTransfer imps = new IMPSTransfer(accNo, balance);
			System.out.println("Enter the amount to be transferred:");
			double transfer = sc.nextDouble();
			if (imps.validate(transfer) == true)
				if (imps.transfer(transfer) == true) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is " + imps.getBalance());
				} else
					System.out.println("Transfer could not be made");
			else
				System.out.println("Account number or transfer amount seems to be wrong");
		}
		if (choice == 3) {
			RTGSTransfer rtgs = new RTGSTransfer(accNo, balance);
			System.out.println("Enter the amount to be transferred:");
			double transfer = sc.nextDouble();
			if (rtgs.validate(transfer) == true)
				if (rtgs.transfer(transfer) == true) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is " + rtgs.getBalance());
				} else
					System.out.println("Transfer could not be made");
			else
				System.out.println("Account number or transfer amount seems to be wrong");
		}
	}

}
