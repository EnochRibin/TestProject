package TicketBooking46;

import java.util.Scanner;

import TicketBooking46.BookTicket;
import TicketBooking46.Customer;
import TicketBooking46.Validate;

public class Add {
	static Scanner scanner = new Scanner(System.in);

	public static Customer addCustomer() {
		System.out.println("Enter the Customer ID :");
		int customerID = Validate.validateNumber();
		System.out.println("Enter the Customer Name :");
		String name = scanner.next();
		System.out.println("Enter the age : ");
		byte age = Validate.validateAge();
		System.out.println("Enter the mobile Number :");
		long mobileNumber = Validate.validateMobileNum();
		System.out.println("Enter Date Of Birth (dd-mm-yyyy) :");
		String dateOfBirth = Validate.validateDOB();
		System.out.println("Enter the Customer Address :");
		String address = scanner.next();
		Customer customer = new Customer(customerID, name, age, mobileNumber, dateOfBirth, address);
		return customer;
	}

	public static BookTicket ticketBooking(Customer[] customer, int customerIndex, String currentDate) {
		System.out.println("Enter the Customer ID :");
		int customerID = Validate.validateCustomerID(customer, customerIndex);
		System.out.println("Enter the mobile Number :");
		long mobileNumber = Validate.validateMobileNum();
		System.out.println("Enter the source :");
		String source = scanner.next();
		System.out.println("Enter the destination : ");
		String destination = Validate.validateDestination(source);
		System.out.println("Enter date of travel(dd:mm:yyyy) : ");
		String date = Validate.validateTravelDate(currentDate);
		System.out.println("Enter Travel Time(hh:mm) : ");
		String time = Validate.validateTime();
		BookTicket ticket = new BookTicket(customerID, mobileNumber, source, destination, date, time);
		System.out.println("Ticket Confirmed");
		return ticket;

	}

}
