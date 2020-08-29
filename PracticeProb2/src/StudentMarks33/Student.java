package StudentMarks33;

public class Student {
	private int studentId;
	private String studentName;
	private float marks;
	private boolean secondChance;
	

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, boolean secondChance) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.secondChance = secondChance;
	}

	public void identifyMarks(float marks) {
		this.marks = marks;
	}

	public void identifyMarks(float markOne, float markTwo) {
		this.marks = markOne > markTwo ? markOne : markTwo;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public void setSecondChance(boolean secondChance) {
		this.secondChance = secondChance;
	}

	public String getStudentName() {
		return studentName;
	}

	public float getMarks() {
		return marks;
	}

	public boolean isSecondChance() {
		return secondChance;
	}
}
