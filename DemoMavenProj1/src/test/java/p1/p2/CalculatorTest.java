package p1.p2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calc=null;
	@BeforeEach
	public void testBeforeEach()
	{
		calc=new Calculator();
	}
	
	@Test
	public void testWith2PositiveNumbers()
	{
		double actual=calc.div(10,2);
		double expected=5.0;
		Assertions.assertEquals(expected, actual);
	}
	
	
	@Test
	public void testWithDivideByZero()
	{
		
		Assertions.assertThrows(ArithmeticException.class,()->
		{
			calc.div(10,0);
		});
	}
	
	@AfterEach
	public void testAfterAll()
	{
		calc=null;
	}
	
	
	
}
