package Project;

public abstract class Employee {
	private int eid;
	private String name;
	private Date birthday;
	private double salaryRate;
	/**
	 * @param eid ma nhan vien
	 * @param name ten nhan vien
	 * @param birthday ngay thang nam sinh
	 * @param salaryRate he so luong
	 */
	public Employee(int eid, String name, Date birthday, double salaryRate) {
		this.eid = eid;
		this.name = name;
		this.birthday = birthday;
		this.salaryRate = salaryRate;
	}
	
	@Override
	public String toString() {
		if (this!=null)
			return "eid=" + eid + ", name=" + name + ", birthday=" + birthday + ", salaryRate=" + salaryRate+"\n";
		else
			return "abc";
	}

	public abstract Driver getDrivers(Vehicle vehicle);
	public Date getBirthday () {
		return this.birthday;
	}
	public abstract double salary();
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salaryRate
	 */
	public double getSalaryRate() {
		return salaryRate;
	}
	/**
	 * @param salaryRate the salaryRate to set
	 */
	public void setSalaryRate(double salaryRate) {
		this.salaryRate = salaryRate;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int howManyEmployee() {
		return 1+this.howManyEmployee();
	}

}
