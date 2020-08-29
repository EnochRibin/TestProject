package SavingsAccount30;

public class SavingsAccount {
	private double balance;
	private int interestRate;
	private int accountNo;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(double balance, int interestRate, int accountNo) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNo = accountNo;
	}

	public void withDraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient Balance");
			return;
		} else {
			balance -= amount;
			System.out.println("Successfully Withdrawn : " + amount);
			System.out.println("Available Balance : " + balance);
		}
	}

	public double calculateInterest() {
		return (balance * interestRate);
	}

	@Override
	public String toString() {
		return "Balance = " + balance + "\nInterestRate = " + interestRate + "\nAccountNo = " + accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
}
