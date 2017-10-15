package main;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	public static int add(String text) {
		int[] numbers;
		int sum = 0;
		if(text.isEmpty()) {
			return 0;
		} else {
			String[] textNumbers = text.split(",");
			numbers = new int[textNumbers.length];
			for(int i = 0; i < textNumbers.length; i++){
				numbers[i] = Integer.parseInt(textNumbers[i]);
				sum += numbers[i];
			}
		}
		
		return sum;
	}

}
