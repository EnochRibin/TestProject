package BankDetails29;

public class Customer {
	private int custId = 0;
	private String custName = "";
	private String custAddress = "";
	private String accType = "";
	private double custBalance = 0;

	public Customer() {
		super();
	}

	public Customer(int custId, String custName) {
		setCustId(custId);
		setCustName(custName);
	}

	public Customer(int custId, String custName, String custAddress) {
		setCustId(custId);
		setCustName(custName);
		setCustAddress(custAddress);
	}

	public Customer(int custId, String custName, String custAddress, String accType, double custBalance) {
		setCustId(custId);
		setCustName(custName);
		setCustAddress(custAddress);
		setAccType(accType);
		setCustBalance(custBalance);
	}

	@Override
	public String toString() {
		return "Customer ID : " + getCustId() + "\n Customer Name : " + getCustName() + "\n Customer Address : "
				+ getCustAddress() + "\n Account Type : " + getAccType() + "\n Balance : " + getCustBalance();
	}

	private void setCustId(int custId) {
		this.custId = custId;
	}

	private void setCustName(String custName) {
		this.custName = custName;
	}

	private void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	private void setAccType(String accType) {
		this.accType = accType;
	}

	private void setCustBalance(double custBalance) {
		this.custBalance = custBalance;
	}

	private int getCustId() {
		return custId;
	}

	private String getCustName() {
		return custName;
	}

	private String getCustAddress() {
		if (custAddress.isEmpty())
			return "";
		return custAddress;
	}

	private String getAccType() {
		if (accType.isEmpty())
			return "";
		return accType;
	}

	private double getCustBalance() {
		if (custBalance == 0)
			return 0;
		return custBalance;
	}

}
