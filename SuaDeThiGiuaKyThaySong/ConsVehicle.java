package Project;


public class ConsVehicle implements IVehical {
	private Vehicle first;
	private IVehical rest;
	/**
	 * @param first phuong tien dau tien
	 * @param rest phuong tien con lai
	 */
	public ConsVehicle(Vehicle first, IVehical rest) {
		this.first = first;
		this.rest = rest;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null ||!(obj instanceof ConsVehicle))
			return false;
		else {
			ConsVehicle that = (ConsVehicle) obj;
			return (this.first.equals(that.first)&&
					this.rest.equals(that.rest));
		}
		
	}

	@Override
	public IVehical sortByEmployee() {
		// TODO Auto-generated method stub
		return this.rest.sortByEmployee().insertInVehicleYear(first);
	}

	@Override
	public IVehical insertInVehicleYear(Vehicle that) {
		// TODO Auto-generated method stub
		if(this.first.producedYearShorter(that))
			return new ConsVehicle(that, this);
		else
			return new ConsVehicle(first, rest.insertInVehicleYear(that));
	}

	@Override
	public String toString() {
		if(this.first!=null)
			return this.first.toString()+"\n"+rest;
		else
			return this.rest.toString();
	}



	@Override
	public boolean contains(Vehicle vehicle) {
		if(this.first.equals(vehicle))
			return true;
		else
			return this.rest.contains(vehicle);
	}
	
}
