package p1.p2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArithmeticOperationsTest {

	@Test
	public void testAddWith2PositiveNumbers()
	{
		ArithmeticOperations obj=new ArithmeticOperations();
		int actual=obj.add(10,10);
		int expected=20;
		
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void testAddWith1PositiveAnd1Negative()
	{
		ArithmeticOperations obj=new ArithmeticOperations();
		int actual=obj.add(10,-10);
		int expected=0;
		
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void testAddWith2NegativeNumbers()
	{
		ArithmeticOperations obj=new ArithmeticOperations();
		int actual=obj.add(-10,-10);
		int expected=-20;
		
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void testDivWith2PositiveNumbers()
	{
		ArithmeticOperations obj=new ArithmeticOperations();
		double actual=obj.div(10,2);
		double expected=5.1;
		
		assertEquals(expected,actual);
	}
	
	
	
}
