package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

}
