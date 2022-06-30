package ReviewLTCB2;

public class SourceFile {
	private String fileName;
	private int size;
	private ClockTime duration;
	/**
	 * @param fileName ten file
	 * @param size kich thuoc cua file
	 * @param duration thoi gian phat
	 */
	public SourceFile(String fileName, int size, ClockTime duration) {
		this.fileName = fileName;
		this.size = size;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return fileName + ", " + size + " bytes, " + duration+", ";
	}
	public boolean longerThan(SourceFile that) {
		return this.duration.longerThan(that.duration);
	}
	/**
	 * @return the duration
	 */
	public ClockTime getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(ClockTime duration) {
		this.duration = duration;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof SourceFile))
			return false;
		else {
			SourceFile that = (SourceFile) obj;
			return(this.fileName.equals(that.fileName)
					&&this.size==that.size
					&&this.duration.equals(that.duration)
					);
		}
	}
	
}
