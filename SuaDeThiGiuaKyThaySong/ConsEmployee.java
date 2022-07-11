package Project;

public class ConsEmployee implements IEmployee {
	private Employee first;
	private IEmployee rest;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsEmployee(Employee first, IEmployee rest) {
		this.first = first;
		this.rest = rest;
	}
	@Override
	public int howManyEmployee() {
		// TODO Auto-generated method stub
		return 1+rest.howManyEmployee();
	}
	
@Override
	public String toString() {
		if(this.first!=null)
			return this.first.toString() +rest;
		else if(this.rest==null)
			return "";
		else
			return this.rest.toString();

	}
@Override
public IEmployee getDriver(Vehicle vehicle) {
	return new ConsEmployee(first.getDrivers(vehicle), rest.getDriver(vehicle));
}
	
	


	
}
