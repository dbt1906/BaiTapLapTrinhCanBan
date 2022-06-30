package ReviewLTCB;

public class Date {
	private int day;
	private int month;
	private int year;
	/**
	 * @param day ngay 
	 * @param month thang
	 * @param year nam
	 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	/**
	 * kiem tra mot ngay co xay tra truoc sau mot ngay khac khong
	 * @param that ngay khac
	 * @return tre ve true neu mot ngay xay tra sau mot ngay khac
	 * Ex: 19/06/2003 xay ra sau ngay 18/06/2003
	 *
	 */
	public boolean after(Date that) {
		if(this.getYear()>that.getYear()) {
			return true;
		}
		else if(this.getYear()==that.getYear()) {
			if(this.getMonth()>that.getMonth()) {
				return true;}
				else if(this.getMonth()==that.getMonth()) {
					if (this.getDay()>that.getDay())
						return true;
					else
						return false;
				}
			else
				return false;
		}
		else
			return false;
	}
	
	
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
}
