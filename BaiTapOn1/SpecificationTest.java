package ReviewLTCB;

import junit.framework.TestCase;

public class SpecificationTest extends TestCase {
	public void testContructor() {
	Specification spec1= new Specification(12, 15);
	Specification spec2= new Specification(15, 20);
}
	public void testVolumn() {
		Specification spec1= new Specification(12, 15);
		Specification spec2= new Specification(15, 20);
		assertEquals(spec1.volumn(),1696.46,0.01);
		assertEquals(spec2.volumn(),3078.76,0.01);
		
	}
}