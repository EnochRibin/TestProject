package TicketBooking46;

public class BookTicket {
	private int customerID;
	private long mobileNumber;
	private String source;
	private String destination;
	private String date;
	private String time;
	
	
	public BookTicket() {
		super();
	}
	public BookTicket(int customerID, long mobileNumber, String source, String destination, String date,
			String time) {
		this.customerID = customerID;
		this.mobileNumber = mobileNumber;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.time = time;
	}
	public int getCustomerID() {
		return customerID;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
	public String getDate() {
		return date;
	}
	public String getTime() {
		return time;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	

}
