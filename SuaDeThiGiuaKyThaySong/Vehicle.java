package Project;

public class Vehicle {
	private int iid;
	private String vehicalName;
	private int producedYear;
	/**
	 * @param iid 	ma phuong tien
	 * @param vehicalName ten phuong tien
	 * @param producedYear nam san xuat
	 */
	public Vehicle(int iid, String vehicalName, int producedYear) {
		this.iid = iid;
		this.vehicalName = vehicalName;
		this.producedYear = producedYear;
	}
	public boolean producedYearShorter(Vehicle that) {
		return this.producedYear>that.producedYear;
	}
	public boolean equals(Object obj) {
		if(obj == null ||!(obj instanceof Vehicle))
			return false;
		else {
			Vehicle that = (Vehicle) obj;
			return (this.iid==that.iid&&
					this.vehicalName.equals(that.vehicalName)&&
					this.producedYear==that.producedYear
					);
		}
			
}
	@Override
	public String toString() {
		return "Vehical [iid=" + iid + ", vehicalName=" + vehicalName + ", producedYear=" + producedYear + "]";
	}}
