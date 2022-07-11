package Project;

public class Driver extends Employee {
	private IVehical vehicalList;
	// vehicle 

	/**
	 * @param eid
	 * @param name
	 * @param birthday
	 * @param salaryRate
	 * @param vehicalList 
	 */
	public Driver(int eid, String name, Date birthday, double salaryRate, IVehical vehicalList) {
		super(eid, name, birthday, salaryRate);
		this.vehicalList = vehicalList;
	}

	@Override
	public double salary() {
		return 900000*this.getSalaryRate();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null ||!(obj instanceof Driver))
			return false;
		else {
			Driver that = (Driver) obj;
			return(this.getEid()== that.getEid()
					&&this.getName()==that.getName()
					&&this.getBirthday().equals(that.getBirthday())
					&&this.getSalaryRate()==that.getSalaryRate()
					);
		}
	}

//	@Override
//	public Driver getDrivers(Vehicle vehicle) {
//		if(this.vehicalList.getList().getFirst().equals(vehicle)) {
//			return this;
//		}
//		else
//			
//	}

	@Override
	public String toString() {
		if(this!=null)
		return super.toString()+vehicalList;
		else
			return "";
	}

@Override
public Driver getDrivers(Vehicle vehicle) {
	if(this.vehicalList.contains(vehicle))
		return this;
	else
		return null;
}


	
}
