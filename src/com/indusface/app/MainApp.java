package com.indusface.app;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainApp {

	public static void main(String[] args) {
		int[] inputArr = {38, 63, 33, 77, 36, 34,100,95,96,97,98};
		int[] outputArr = new int[inputArr.length];
		int multipleOf = 5;
		int i = 0;
		
		RoundOfUtil roundOf = new RoundOfUtil();
		IntStream stream = Arrays.stream(inputArr);
		
		for(Integer value: inputArr)
		{
			if(value > 35) {
				int nextRoundOf = (int) roundOf.round(value, multipleOf);
				if((nextRoundOf-value)<3)
					outputArr[i] = nextRoundOf;
				else
					outputArr[i] = value;
			}	
			else
				outputArr[i] = value;
			i++;
		}
		
		Arrays.stream(outputArr).forEach(out -> System.out.print(out + " "));
		
	}
}
