package ReviewLTCB;

import junit.framework.TestCase;

public class DateTest extends TestCase {
	public void testConstructor() {
		Date productionDate1= new Date(1,12,2018);
		Date expiredDate1= new Date(1,12,2021);
	}
	public void testAfter() {
		Date productionDate1= new Date(1,12,2018);
		Date expiredDate1= new Date(1,12,2021);
		assertTrue(expiredDate1.after(productionDate1));
	}
}
