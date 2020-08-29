package ManageCustomers47;

public class BankUserApp {
	public static void main(String[] args) {
		char input = 'y';
		BankUsers[] user = new BankUsers[10];
		int userIndex = 0;
		user[userIndex] = Details.getDetails();
		userIndex++;
		do {
			switch (DisplayDetails.menuInfo()) {
			case 1:
				user[userIndex] = Details.getDetails();
				userIndex++;
				break;
			case 2:
				Details.updateDetails(user, userIndex);
				break;
			case 3:
				System.out.println("Deleting the last Entered User Details : ");
				user[userIndex] = null;
				userIndex--;
				break;
			case 4:
				DisplayDetails.displayOptions(user, userIndex);
				break;
			case 5:
				System.out.println("Exit");
				input = 'n';
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (input == 'y');

	}

}
