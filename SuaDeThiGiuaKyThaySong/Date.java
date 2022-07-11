package Project;

public class Date {
	private int day;
	private int month;
	private int year;
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null ||!(obj instanceof Date))
			return false;
		else {
			Date that = (Date) obj;
			return(this.day== that.day
					&&this.month==that.month
					&&this.year==that.year
					);
		}
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
