package Project;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
	Employee staff1= new Staff(101,"Le Nhan Minh", new Date(2,8,1994),1.2,"Thuộc bộ phận giao hàng");
	Employee staff2= new Staff(102,"Ai Nguyen", new Date(1,1,1989),1.5,"Thuộc bộ phận kế toán");
	Vehicle vehical1= new Vehicle(101,"Xe tải", 2020);
	Vehicle vehical2= new Vehicle(102,"Xe khách", 2016);
	Vehicle vehical3= new Vehicle(103,"Xe Bus", 2012);
	Vehicle vehical4= new Vehicle(104,"Xe bán tải", 2010);
	MTVehicle empty = new MTVehicle();
	IVehical list1= new ConsVehicle(vehical1, new ConsVehicle(vehical2, new ConsVehicle(vehical4, empty)));
	IVehical list2= new ConsVehicle(vehical1, new ConsVehicle(vehical3, empty));
	IVehical list3= new ConsVehicle(vehical3, new ConsVehicle(vehical4, empty));
	public void testConstructor() {
		Employee staff1= new Staff(101,"Le Nhan Minh", new Date(2,8,1994),1.2,"Thuộc bộ phận giao hàng");
		Employee staff2= new Staff(102,"Ai Nguyen", new Date(1,1,1989),1.5,"Thuộc bộ phận kế toán");
		Employee driver1= new Driver(201, "Ta Phap Quang", new Date(12,5,1989),2.5,list1 );
		Employee driver2= new Driver(202, "Thien Dinh", new Date(1,9,1989),2.2,list2 );
		Employee driver3= new Driver(203, "Tran Tuan Minh", new Date(8,10,1992),2,list3 );
		
	}
	public void testGetBirthday() {
		Employee staff1= new Staff(101,"Le Nhan Minh", new Date(2,8,1994),1.2,"Thuộc bộ phận giao hàng");
		assertEquals(staff1.getBirthday(),new Date(2,8,1994));
	}
	public void testSalary() {
		Employee staff1= new Staff(101,"Le Nhan Minh", new Date(2,8,1994),1.2,"Thuộc bộ phận giao hàng");
		Employee driver1= new Driver(201, "Ta Phap Quang", new Date(12,5,1989),2.5,list1 );
		assertEquals(staff1.salary(),1200000,0);
		assertEquals(driver1.salary(),2250000,0);
		
	}
	public void testHowManyEmployee() {
		Employee staff1= new Staff(101,"Le Nhan Minh", new Date(2,8,1994),1.2,"Thuộc bộ phận giao hàng");
		System.out.println(staff1.howManyEmployee());
	}
	
}
