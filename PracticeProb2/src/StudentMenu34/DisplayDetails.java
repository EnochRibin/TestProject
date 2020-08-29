package StudentMenu34;

public class DisplayDetails {

	public static int menuInfo() {
		System.out.println("Menu ");
		System.out.println("1.Create Student Record");
		System.out.println("2.Display Student Names in sorted order based on branch");
		System.out.println("3.Display Student ID in ascending sorted order");
		System.out.println("4.Exit");
		int menu = StudentRecordApp.validateNumber();
		return menu;
	}

	public static void displayBranch(StudentRecord[] student, int studentIndex) {
		for (int i = 0; i < studentIndex; i++)
			for (int j = 1; j < studentIndex - i; j++)
				if (student[j].getStudentBranch().compareTo(student[j - 1].getStudentBranch()) < 0) {
					StudentRecord tempStudent;
					tempStudent = student[j];
					student[j] = student[j - 1];
					student[j - 1] = tempStudent;
				}
		display(student,studentIndex);
	}


	public static void displayID(StudentRecord[] student, int studentIndex) {
		for (int i = 0; i < studentIndex; i++)
			for (int j = 1; j < studentIndex - i; j++)
				if (student[j].getStudentId() < student[j - 1].getStudentId()) {
					StudentRecord tempStudent;
					tempStudent = student[j];
					student[j] = student[j - 1];
					student[j - 1] = tempStudent;
				}
		display(student,studentIndex);
	}
	
	private static void display(StudentRecord[] student, int studentIndex) {
		for(int  i = 0 ; i < studentIndex ;  i++) {
			System.out.println(student[i]);
		}
	}
	
	
}
