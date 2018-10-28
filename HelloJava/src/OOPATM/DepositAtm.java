package OOPATM;

public class DepositAtm extends StandardAtm {
	private Customer cust1;
	private double balance;

	// constructor
	public DepositAtm(Customer customer) {
		super(customer);
		this.cust1 = customer;
		this.balance = balance;
	}

	public void depositCash(int amount) {
		if (amount > 0 && amount < 100 && cust1.getBalance() >= amount) {
			if (cust1.getBalance() >= amount)// compare balance to the amount to deposit + amount = balance(amount) +
												// amount;
			{

				cust1.setBalance(cust1.getBalance() + amount); // set the new balance
				System.out.println("Deposit Complete. New Balance:  £" + cust1.getBalance());

			}
		} else {
			System.out.println("Transaction cancelled due to insufficient funds. Please retry:");

		}
	}
}
