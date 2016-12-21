import junit.framework.TestCase;


public class CalculatorTest extends TestCase {

	Calculator calc = new Calculator();
	
	public void testAdd()
	{
		assertEquals(30, calc.add(15, 15));
	}
	
	public void testSub()
	{
		assertEquals(-5, calc.sub(10, 15));
	}
	
	public void testMul()
	{
		assertEquals(150, calc.multiply(10, 15));
	}
}