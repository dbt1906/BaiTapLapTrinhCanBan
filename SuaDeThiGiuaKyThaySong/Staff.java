package Project;

public class Staff extends Employee {
	private String department;

	/**
	 * @param eid
	 * @param name
	 * @param birthday
	 * @param salaryRate
	 * @param department bo phan
	 */
	public Staff(int eid, String name, Date birthday, double salaryRate, String department) {
		super(eid, name, birthday, salaryRate);
		this.department = department;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return 1000000*this.getSalaryRate();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null ||!(obj instanceof Staff))
			return false;
		else {
			Staff that = (Staff) obj;
			return(this.getEid()== that.getEid()
					&&this.getName()==that.getName()
					&&this.getBirthday().equals(that.getBirthday())
					&&this.getSalaryRate()==that.getSalaryRate()
					&&this.getDepartment().equals(that.getDepartment())
					);
		}
	}

	@Override
	public Driver getDrivers(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
