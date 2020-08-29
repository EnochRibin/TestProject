package TicketBooking46;

public class TicketBookingApp {
	public static void main(String[] args) {
		char input = 'y';
		Customer[] customer = new Customer[10];
		BookTicket[] ticket = new BookTicket[10];
		int ticketIndex = 0;
		int customerIndex = 0;
		customer[customerIndex] = Add.addCustomer();
		customerIndex++;
		String currentDate = "17:08:2020";
		do {
			switch (DisplayDetails.menuInfo()) {
			case 1:
				customer[customerIndex] = Add.addCustomer();
				customerIndex++;
				break;
			case 2:
				ticket[ticketIndex] = Add.ticketBooking(customer, customerIndex, currentDate);
				ticketIndex++;
				break;
			case 3:
				DisplayDetails.displayOptions(customer, customerIndex);
				break;
			case 4:
				System.out.println("Exit");
				input = 'n';
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (input == 'y');

	}

}
