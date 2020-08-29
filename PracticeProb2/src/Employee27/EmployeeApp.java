package Employee27;

import java.util.Scanner;

public class EmployeeApp {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of Employees:");
		int noOfEntry = validateNumber();
		Employee[] employee = getDetails(noOfEntry);
		displayDetails(noOfEntry, employee);
	}

	private static Employee[] getDetails(int noOfEntry) {
		Employee[] employees = new Employee[noOfEntry];
		Employee employee = new Employee();
		for (int i = 0; i < noOfEntry; i++) {
			System.out.println("Employee Entry : " + (i + 1));
			System.out.println("Enter Employee ID :");
			int empID = validateNumber();
			System.out.println("Enter Employee Name :");
			String empName = scanner.next();
			System.out.println("Enter Employee Designation :");
			String empDesig = scanner.next();
			System.out.println("Enter Employee Department :");
			String empDept = scanner.next();
//			employee[i] = new Employee();
//			employee[i].setEmpID(empID);
//			employee[i].setEmpName(empName);
//			employee[i].setEmpDesig(empDesig);
//			employee[i].setEmpDept(empDept);
			employee.setEmpID(empID);
			employee.setEmpName(empName);
			employee.setEmpDesig(empDesig);
			employee.setEmpDept(empDept);
			employees[i] = employee;
		}
		return employees;
	}

	private static void displayDetails(int noOfEntry, Employee[] emp) {
		for (int i = 0; i < noOfEntry; i++) {
			System.out.println("Employee " + (i + 1) + " Details:");
			System.out.println(emp[i]);
			System.out.println("_______________________________________________");
		}
	}

	public static int validateNumber() {
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Enter a valid Number");
				scanner.next();
			}
			int number = scanner.nextInt();
			if (number < 0) {
				System.out.println("Enter positive number : ");
				continue;
			}
			return number;
		} while (true);
	}

}
