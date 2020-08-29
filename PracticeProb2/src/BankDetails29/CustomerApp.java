package BankDetails29;

public class CustomerApp {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1001, "Kumar", "Rajajinagar , Bangalore-10", "SB", 1500);
		Customer customer2 = new Customer(1002, "Raja");
		Customer customer3 = new Customer(1003, "Shanthi", "Rajajinagar , Bangalore-10");

		printDetails(customer1);
		printDetails(customer2);
		printDetails(customer3);

	}

	private static void printDetails(Customer customer) {
		System.out.println(customer);
		System.out.println("------------------------------------");
	}

}
