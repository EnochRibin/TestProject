package TicketBooking46;

public class Customer {
	private int customerID;
	private String name;
	private byte age;
	private long mobileNumber;
	private String dateOfBirth;
	private String address;
	

	public Customer() {
		super();
	}

	public Customer(int customerID, String name, byte age, long mobileNumber, String dateOfBirth, String address) {
		this.customerID = customerID;
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	@Override
	public String toString() {
		return "-------------------------------\n" + "CustomerID : " + getCustomerID() + "\nCustomer Name : "
				+ getName() + "\nCustomer Age : " + getAge() + "\nCustomer Mobile Number : " + getMobileNumber()
				+ "\nDOB : " + getDateOfBirth() + "\nCustomer Address : " + getAddress()
				+ "\n-------------------------------";
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getName() {
		return name;
	}

	public byte getAge() {
		return age;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
