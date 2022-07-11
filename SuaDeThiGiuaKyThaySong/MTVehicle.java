package Project;

public class MTVehicle implements IVehical {

	@Override
	public IVehical sortByEmployee() {
		// TODO Auto-generated method stub
		return new MTVehicle();
	}

	@Override
	public IVehical insertInVehicleYear(Vehicle that) {
		// TODO Auto-generated method stub
		return new ConsVehicle(that,new MTVehicle());
	}
	public boolean equals(Object obj) {
		if(obj == null ||!(obj instanceof ConsVehicle))
			return false;
		else
			return true;}

	@Override
	public String toString() {
		return "";
	}



	@Override
	public boolean contains(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return false;
	}


	
	
}
