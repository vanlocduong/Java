package OOPATM;

public class Customer {
		private String acctNo;
		private String PIN;
		private double balance;
		private int attempt;

		public Customer(String acctNo, String PIN, double balance, int attempt) {
		    super();
		    this.acctNo = acctNo;
		    this.PIN = PIN;
		    this.balance = balance;
		    this.attempt = attempt;
		}
		public int getAttempt() {
		    return attempt;
		}
		public void setAttempt(int attempt) {
		    this.attempt = attempt;
		}
		public String getAcctNo() {
		    return acctNo;
		}
		public void setAcctNo(String acctNo) {
		    this.acctNo = acctNo;
		}
		public String getPIN() {
		    return PIN;
		}
		public void setPIN(String PIN) {
		    this.PIN = PIN;
		}
		public double getBalance() {
		    return balance;
		}
		public void setBalance(double balance) {
		    this.balance = balance;
		}

}
