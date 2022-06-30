package ReviewLTCB;

public class Specification {
	private int baseDiameter;
	private int height;
	/**
	 * @param baseDiameter ban kinh day
	 * @param height chieu cao
	 */
	public Specification(int baseDiameter, int height) {
		this.baseDiameter = baseDiameter;
		this.height = height;
	}
//	tinh the tich cua hop sua bang cong thuc: the tich = chieu cao nhan binh phuong ban kinh nhan Pi
	public double volumn() {
		return Math.PI*height*(baseDiameter/2)*(baseDiameter/2);
		
	}
	
}
