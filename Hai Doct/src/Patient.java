
public class Patient extends DateFormatter {
	private String name, email, counseling;
	
	public Patient(String DOB, String name, String email, String counseling) {
		super();
		this.setDOB(DOB);
		super.splitDOB();
		this.name = name;
		this.email = email;
		this.counseling = counseling;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCounseling() {
		return counseling;
	}

	public void setCounseling(String counseling) {
		this.counseling = counseling;
	}

}
