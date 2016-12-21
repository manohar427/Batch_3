import junit.framework.TestCase;

public class MyAppTest extends TestCase {

	Calculator c = new Calculator();

	
	public void tesAddtCalc() {
		assertEquals(10, c.add(5, 5));
		assertEquals(20, c.add(15, 5));
		assertEquals(20, c.add(10, 10));
	}
	
	public void tesSubtCalc() {
		assertEquals(10, c.sub(10, 10));
		assertEquals(20, c.sub(30, 10));
		assertEquals(80, c.sub(90, 10));
	}
	public void testMulCalc() {
		assertEquals(100, c.multiply(10, 10));
		assertEquals(100, c.multiply(10, 10));
		assertEquals(100, c.multiply(10, 10));
	}
}
