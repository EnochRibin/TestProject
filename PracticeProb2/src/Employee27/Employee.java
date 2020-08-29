package Employee27;

public class Employee {
	private int empID;
	private String empName;
	private String empDesig;
	private String empDept;

	public Employee() {
	}

	

	public Employee(int empID, String empName, String empDesig, String empDept) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empDept = empDept;
	}



	@Override
	public String toString() {
		return "Employee ID = " + getEmpID() + "\nEmployee Name : " + getEmpName() + "\nEmployee Designation : "
				+ getEmpDesig() + "\nEmployee Department : " + getEmpDept();
	}

	public void setEmpName(String empName) {
		try {
			if (empName != null)
				this.empName = empName;
			else
				throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("Null pointer Exception : Enter a valid Name ");
			System.exit(0);
		}
		this.empName = empName;
	}

	public void setEmpDesig(String empDesig) {
		if ((empDesig.equals("Developer") || empDesig.equals("Tester") || empDesig.equals("Leader")
				|| empDesig.equals("Manager"))) {
			this.empDesig = empDesig;
			return;
		}
		System.out.println("Invalid Desigantion");
	}

	public void setEmpDept(String empDept) {
		if ((empDept.equals("TTH") || empDept.equals("RCM") || empDept.equals("Digital") || empDept.equals("DevOps"))) {
			this.empDept = empDept;
			return;
		}
		System.out.println("Invalid Dept");
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getEmpID() {
		return empID;
	}

	public String getEmpDept() {
		return empDept;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public String getEmpName() {
		return empName;
	}
}
