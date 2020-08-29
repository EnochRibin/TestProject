package StudentMenu34;

public class StudentRecord {

	private int studentId;
	private String studentName;
	private String studentBranch;

	public StudentRecord() {
		super();
	}

	public StudentRecord(int studentId, String studentName, String studentBranch) {
		setStudentBranch(studentBranch);
		setStudentId(studentId);
		setStudentName(studentName);
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	private void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	private void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	private void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	@Override
	public String toString() {
		System.out.println("-----------------------------------------------");
		return "StudentRecord [studentId=" + studentId + ", studentName=" + studentName + ", studentBranch="
				+ studentBranch + "]";
	}

}
