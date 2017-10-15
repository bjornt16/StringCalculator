package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}
	
	@Test
	public void testtwoNumber() {
		assertEquals(3, Calculator.add("1,2"));
	}

}
