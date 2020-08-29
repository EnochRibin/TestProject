package ArrayStudent35;

public class Student {
	private int studentId;
	private String studentName;
	private String branch;
	private float score;
	
	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String branch, float score) {
		setBranch(branch);
		setScore(score);
		setStudentId(studentId);
		setStudentName(studentName);
	}

	@Override
	public String toString() {
		System.out.println("_________________________________________________________");
		return " Student ID : " + getStudentId() + "\n Student Name : " + getStudentName() + "\n Branch : "
				+ getBranch() + "\n Score : " + getScore();
	}

	private void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	private void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	private void setBranch(String branch) {
		this.branch = branch;
	}

	private void setScore(float score) {
		this.score = score;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getBranch() {
		return branch;
	}

	public float getScore() {
		return score;
	}
}
