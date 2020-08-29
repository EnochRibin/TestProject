package ManageCustomers47;

public class Details {

	public static BankUsers getDetails() {
		System.out.println("Enter the Account Number :");
		int accNumber = Validate.validateNumber();
		System.out.println("Enter the Account Name :");
		String name = Validate.scanner.next();
		System.out.println("Enter the Account Type(savings/loan/current) :");
		String accType = Validate.validateAccType();
		System.out.println("Enter Your Date-Of-Birth (DD-MM-YYYY) :");
		String date = Validate.validateDate();
		System.out.println("Enter the Account Balance :");
		long balance = Validate.validateBalance();
		System.out.println("Enter Your Address :");
		String address = Validate.scanner.next();
		BankUsers user = new BankUsers(accNumber, name, accType, date, balance, address);
		return user;
	}

	public static void updateDetails(BankUsers[] user, int userIndex) {
		System.out.println("Want to update Name Or Address :");
		String update = Validate.validateUpdate();
		System.out.println("Enter the Account Number to be updated");
		int accNumber = Validate.validateNumber();
		for (int i = 0; i < userIndex; i++) {
			if (accNumber == user[i].getAccountNumber()) {
				if (update.equals("name")) {
					System.out.println("Enter the name : ");
					String name;
					name = DisplayDetails.scanner.next();
					user[i].setName(name);
					return;
				}
				if (update.equals("address")) {
					System.out.println("Enter the address : ");
					String address;
					address = DisplayDetails.scanner.next();
					user[i].setAddress(address);
					return;
				}
			}
		}
		System.out.println("The AccountNumber does not exist ");
	}

}
