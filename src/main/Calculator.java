package main;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	public static int add(String text) {
		int[] numbers;
		int sum = 0;
		int temp = 0;
		String neg = "";
		if(text.isEmpty()) {
			return 0;
		} else {
			String[] textNumbers = text.split("\n|,");
			numbers = new int[textNumbers.length];
			for(int i = 0; i < textNumbers.length; i++){
				temp = Integer.parseInt(textNumbers[i]);
				if(temp > 1000) {
					continue;
				}
				numbers[i] = temp;
				sum += numbers[i];
				if(numbers[i] < 0) {
					neg += neg == "" ? Integer.toString(temp) : "," + Integer.toString(temp);
				}
			}
		}
		
		if(!neg.isEmpty()) {
			throw new IllegalArgumentException ("Negatives not allowed: " + neg);
		}
		
		return sum;
	}

}
