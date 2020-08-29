package ManageCustomers47;

public class BankUsers {
	private int accountNumber;
	private String name;
	private String accountType;
	private String dateOfBirth;
	private long balance;
	private String address;

	public BankUsers(int accountNumber, String name, String accountType, String date, long balance, String address) {
		setAccountNumber(accountNumber);
		setName(name);
		setAccountType(accountType);
		setDate(date);
		setAddress(address);
		setBalance(balance);
	}

	@Override
	public String toString() {
		return "---------------------------------------\nAccount Number : " + getAccountNumber() + "\nUser Name : "
				+ getName() + "\nAccount Type : " + getAccountType() + "\nDOB : " + getDate() + "\nAccount Balance : "
				+ getBalance() + "\nAddress : " + getAddress() + "\n---------------------------------------";
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getDate() {
		return dateOfBirth;
	}

	public long getBalance() {
		return balance;
	}

	public String getAddress() {
		return address;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setDate(String date) {
		this.dateOfBirth = date;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
