package OOPATM;

import java.util.ArrayList;
import java.util.List;

public class StandardAtm {
	private Customer cust1;
	List<Customer> cust = new ArrayList<>(); // an list for number of customers
	Boolean accessed = false;

	// constructor
	public StandardAtm(Customer customer) {
		this.cust1 = customer;
	}

	public void displayBalance() {
		if (accessed = true) {
			System.out.println("Balance: " + cust1.getBalance()); // displays the balance
		}
	}

	public void accessacc(String acctNo, String PIN) // log in method
	{
		if (cust1.getAcctNo().equals(acctNo) && cust1.getPIN().equals(PIN)) {
			System.out.println("Welcome! Your account balance is: £" + cust1.getBalance());

		}

		else {
			// for (int attempt=1; attempt<=3;attempt++) //1. limit the number of attempts

			/*
			 * if (attempt == 3 && cust1.getAcctNo().equals(acctNo) !=
			 * cust1.getPIN().equals(PIN)) { //1. find the opposite of equals
			 * System.out.println("Invalid Account Number & PIN! " + "Attempt: "+attempt); }
			 */

			if (cust1.getAcctNo().equals(acctNo) != cust1.getPIN().equals(PIN))
				cust1.setAttempt(cust1.getAttempt() + 1);
			{
				System.out.println("Invalid Account Number & PIN! " + "Attempt: " + cust1.getAttempt());

				if (cust1.getAttempt() >= 3) {
					System.out.println("Number of attempts exceeded. Please contact your bank. ");

				}
			}
		}
	}

	public void withdrawCash(int amount) {
		if (accessed = true) {
			if (amount > 0 && amount < 301 && cust1.getBalance() >= amount) // nested statements are required to run a
																			// number of commands
			{
				if (amount > 0 && amount < 301) {
					if (cust1.getBalance() >= amount) // compare balance to the amount you want to withdraw if amount to
														// withdraw is same as balance
					{
						cust1.setBalance(cust1.getBalance() - amount); // set the new balance
						System.out.println("Withdrawn complete! New Balance : £" + cust1.getBalance());
					}
				} else {
					if (accessed = false)
						System.out.println("Transaction cancelled: please enter correct amount");

				}
			}
		}
	}

}
