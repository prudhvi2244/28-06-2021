package p1.p2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName(value = "This is a Test class For Testing Methods From ArithmeticOperations")
public class ArithmeticOperationsTest {

	@BeforeAll
	public static void testBeforeAll()
	{
		System.out.println("Executed Before All Test Methods");
	}
	
	@BeforeEach
	public void testBeforeEach()
	{
		System.out.println("Executed Before Each Test Method");
	}
	
	
	
	@Test
	@DisplayName(value ="Testing add() method with 2 positive numbers")
	public void testAddWith2PositiveNumbers()
	{
		ArithmeticOperations obj=new ArithmeticOperations();
		int actual=obj.add(10,10);
		int expected=20;
		System.out.println("Testing add() method with 2 positive numbers");
		assertEquals(expected,actual);
	}
	
	
	@Test
	@DisplayName(value ="Testing add() method with 1 positive and 1 negative number")
	@Disabled
	public void testAddWith1PositiveAnd1Negative()
	{
		ArithmeticOperations obj=new ArithmeticOperations();
		int actual=obj.add(10,-10);
		int expected=0;
		System.out.println("Testing add() method with 1 positive and 1 negative number");
		assertEquals(expected,actual);
	}
	
	
	@Test
	@DisplayName(value ="Testing add() method with 2 negative numbers")
	public void testAddWith2NegativeNumbers()
	{
		ArithmeticOperations obj=new ArithmeticOperations();
		int actual=obj.add(-10,-10);
		int expected=-20;
		System.out.println("Testing add() method with 2 negative numbers");
		assertEquals(expected,actual);
	}
	
	
	@Test
	@DisplayName(value ="Testing add() method with 2 positive numbers")
	public void testDivWith2PositiveNumbers()
	{
		ArithmeticOperations obj=new ArithmeticOperations();
		double actual=obj.div(10,2);
		double expected=5.0;
		System.out.println("Testing add() method with 2 positive numbers");
		assertEquals(expected,actual);
	}
	
	@AfterEach
	public void afterEach()
	{
		System.out.println("Executed After Each Test Method");
	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("Executed After All Test Methods");
	}
	
	
}
