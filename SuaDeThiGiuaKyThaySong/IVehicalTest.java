package Project;

import junit.framework.TestCase;

public class IVehicalTest extends TestCase {
	public void testConstructor() {
		Vehicle vehical1= new Vehicle(101,"Xe tải", 2020);
		Vehicle vehical2= new Vehicle(102,"Xe khách", 2016);
		Vehicle vehical3= new Vehicle(103,"Xe Bus", 2012);
		Vehicle vehical4= new Vehicle(104,"Xe bán tải", 2010);
		MTVehicle empty = new MTVehicle();
		IVehical list1= new ConsVehicle(vehical1, new ConsVehicle(vehical2, new ConsVehicle(vehical4, empty)));
		IVehical list2= new ConsVehicle(vehical1, new ConsVehicle(vehical3, empty));
		IVehical list3= new ConsVehicle(vehical3, new ConsVehicle(vehical4, empty));
	}
	public void testSortByEmployee() {
		Vehicle vehical1= new Vehicle(101,"Xe tải", 2020);
		Vehicle vehical2= new Vehicle(102,"Xe khách", 2016);
		Vehicle vehical3= new Vehicle(103,"Xe Bus", 2012);
		Vehicle vehical4= new Vehicle(104,"Xe bán tải", 2010);
		MTVehicle empty = new MTVehicle();
		IVehical list1= new ConsVehicle(vehical1, new ConsVehicle(vehical2, new ConsVehicle(vehical4, empty)));
		IVehical list2= new ConsVehicle(vehical1, new ConsVehicle(vehical3, empty));
		IVehical list3= new ConsVehicle(vehical3, new ConsVehicle(vehical4, empty));
		assertEquals(list3.sortByEmployee(),new ConsVehicle(vehical4, new ConsVehicle(vehical3, 
				new ConsVehicle(vehical2, new ConsVehicle(vehical1, empty)))));
	}
}
