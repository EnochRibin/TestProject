package CustomerFeedback31;

public class Customer {
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private long mobileNo;
	private double feedbackRating;

	public Customer() {
		super();
	}

	public Customer(String name, long mobileNo, double feedbackRating) {
		setName(name);
		setMobileNo(mobileNo);
		setFeedbackRating(feedbackRating);
	}

	@Override
	public String toString() {
		return getFeedbackRating() + " out of 5";
	}

	public String getName() {
		return name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public double getFeedbackRating() {
		return feedbackRating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setFeedbackRating(double feedbackRating) {
		this.feedbackRating = feedbackRating;
	}

}
