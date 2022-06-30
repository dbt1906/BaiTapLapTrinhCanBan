package ReviewLTCB;

import junit.framework.TestCase;

public class ManufactorTest extends TestCase {
	public void testContructor() {
		Manufactor manufactor1= new Manufactor("VinaMilk", "VietNam");
		Manufactor manufactor2= new Manufactor("Nestle", "USA");
	}
}
