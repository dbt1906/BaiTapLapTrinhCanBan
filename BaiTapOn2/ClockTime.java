package ReviewLTCB2;

public class ClockTime {
	private int minute;
	private int second;
	/**
	 * @param minute phut
	 * @param second giay
	 */
	public ClockTime(int minute, int second) {
		this.minute = minute;
		this.second = second;
	}
	@Override
	public String toString() {
		return minute + ":" + second ;
	}
	public boolean longerThan(ClockTime that) {
		if(this.getMinute()>that.getMinute()) {
			return true;}
			else if (this.getMinute()==that.getMinute()) {
				if(this.getSecond()>that.getSecond()) {
					return true;
				}
				else return false;
			}
			else
				return false;
		
	}
	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}
	/**
	 * @param minute the minute to set
	 */
	public void setMinute(int minute) {
		this.minute = minute;
	}
	/**
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}
	/**
	 * @param second the second to set
	 */
	public void setSecond(int second) {
		this.second = second;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ClockTime))
			return false;
		else {
			ClockTime that = (ClockTime) obj;
		return (this.minute==that.minute
				&&this.second==that.second
				)
				;
		}
	}
	
	}

