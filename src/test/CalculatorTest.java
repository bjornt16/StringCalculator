package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Random;
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
	public void testTwoNumber() {
		assertEquals(3, Calculator.add("1,2"));
	}
	
	@Test
	public void testRandomArgumentLength() {
		Random random = new Random();
		int loop = random.nextInt(100);
		int sum = 0;
		String text = "";
		
		for(int i = 0; i < loop; i++) {
			sum += 1;
			text += i == 0 ? "1" : ",1"; 
		}
		
		System.out.print(sum +" "+ text);
		
		assertEquals(sum, Calculator.add(text));
	}

	@Test
	public void testNewLineDelimitter() {
		assertEquals(3, Calculator.add("1\n2"));
		assertEquals(6, Calculator.add("1\n2,3"));
	}
	
}
