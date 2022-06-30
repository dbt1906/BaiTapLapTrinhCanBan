package ReviewLTCB;

import junit.framework.TestCase;

public class MilkTest extends TestCase {
	Manufactor manufactor1= new Manufactor("VinaMilk", "VietNam");
	Specification spec1= new Specification(12, 15);
	Date productionDate1= new Date(1,12,2018);
	Date expiredDate1= new Date(1,12,2021);

	Manufactor manufactor2= new Manufactor("Nestle", "USA");
	Specification spec2= new Specification(15, 20);
	Date productionDate2= new Date(1,8,2016);
	Date expiredDate2= new Date(1,8,2016);
	
	Manufactor manufactor3= new Manufactor("Meiji", "Japan");
	Specification spec3= new Specification(15, 20);
	Date productionDate3= new Date(1,6,2018);
	Date expiredDate3= new Date(1,6,2021);
	
	Manufactor manufactor4= new Manufactor("VinaMilk", "VietNam");
	Specification spec4= new Specification(15, 20);
	Date productionDate4= new Date(1,11,2020);
	Date expiredDate4= new Date(1,11,2020);
	public void testConstructor() {
		
		
		Milk m1 = new Milk("Dielac",0.5,120000,spec1,manufactor1,productionDate1,expiredDate1);
		Milk m2 = new Milk("Lactogen",0.9,294000,spec2,manufactor2,productionDate2,expiredDate2);
		Milk m3 = new Milk("Meiji Gold",0.9,463000,spec3,manufactor3,productionDate3,expiredDate3);
		Milk m4 = new Milk("Grow Optimal",0.9,256000,spec4,manufactor4,productionDate4,expiredDate4);
					}
	public void testSameCompany() {
		Milk m1 = new Milk("Dielac",0.5,120000,spec1,manufactor1,productionDate1,expiredDate1);
		Milk m2 = new Milk("Lactogen",0.9,294000,spec2,manufactor2,productionDate2,expiredDate2);
		Milk m3 = new Milk("Lactogen",0.9,294000,spec2,manufactor2,productionDate2,expiredDate2);
		assertFalse(m1.sameCompany(m2));
		assertTrue(m2.sameCompany(m3));
	}
	public void testVolumn() {
		Milk m1 = new Milk("Dielac",0.5,120000,spec1,manufactor1,productionDate1,expiredDate1);
		Milk m2 = new Milk("Lactogen",0.9,294000,spec2,manufactor2,productionDate2,expiredDate2);
		assertEquals(m1.volumn(),1696.46,0.01);
		assertEquals(m2.volumn(),3078.76,0.01);
		
	}
	public void testGreaterThan() {
		Milk m1 = new Milk("Dielac",0.5,120000,spec1,manufactor1,productionDate1,expiredDate1);
		Milk m2 = new Milk("Lactogen",0.9,294000,spec2,manufactor2,productionDate2,expiredDate2);
		assertFalse(m1.greaterThan(m2));
		assertTrue(m2.greaterThan(m1));
	}
	public void testProduceAfter() {
		Date d1= new Date(1,1,2015);
		Milk m1 = new Milk("Dielac",0.5,120000,spec1,manufactor1,productionDate1,expiredDate1);
		assertTrue(m1.produceAfter(d1));
	}
	public void testIsExpired() {
		Milk m1 = new Milk("Dielac",0.5,120000,spec1,manufactor1,productionDate1,expiredDate1);
		Milk m2 = new Milk("Lactogen",0.9,294000,spec2,manufactor2,productionDate2,expiredDate2);
		assertTrue(m1.isExpired());
		assertTrue(m2.isExpired());
		
	}
	public void testDiscount() {
		Milk m1 = new Milk("Dielac",0.5,120000,spec1,manufactor1,productionDate1,expiredDate1);
		Milk m2 = new Milk("Lactogen",0.9,294000,spec2,manufactor2,productionDate2,expiredDate2);
		assertEquals(m1.discount(),36000.0,0.01);
		assertEquals(m2.discount(),88200.0,0.01);
		
	}
}
