
public class DateFormatter {
	private String DOB;
	private Integer dateDOB, monthDOB, yearDOB;
	private String[] splitResult;
	
	public void splitDOB() {
		setSplitResult(getDOB().split("/"));
		setDateDOB(Integer.valueOf(getSplitResult()[0]));
		setMonthDOB(Integer.valueOf(getSplitResult()[1]));
		setYearDOB(Integer.valueOf(getSplitResult()[2]));
	}
	
	public String[] getSplitResult() {
		return splitResult;
	}

	public void setSplitResult(String[] splitResult) {
		this.splitResult = splitResult;
	}
	
	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public Integer getDateDOB() {
		return dateDOB;
	}

	public void setDateDOB(Integer dateDOB) {
		this.dateDOB = dateDOB;
	}

	public Integer getMonthDOB() {
		return monthDOB;
	}

	public void setMonthDOB(Integer monthDOB) {
		this.monthDOB = monthDOB;
	}

	public Integer getYearDOB() {
		return yearDOB;
	}

	public void setYearDOB(Integer yearDOB) {
		this.yearDOB = yearDOB;
	}

}
