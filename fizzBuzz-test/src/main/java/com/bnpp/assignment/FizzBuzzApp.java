package com.bnpp.assignment;

import java.util.Scanner;

public class FizzBuzzApp {

	private static String FIZZ = "fizz";
	private static String BUZZ = "buzz";
	private static String FIZZ_BUZZ = "fizz buzz";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number for FizzBuzz Test: ");  
		int num = sc.nextInt();
		String result = new FizzBuzzApp().readNumber(num);
		System.out.println(num + " read as :: "+result);
	}

	public String readNumber(int num) {
		
		if(num % 3 == 0 && num % 5 == 0) return FIZZ_BUZZ;
		else if(num % 3 == 0) return FIZZ;
		else if(num % 5 == 0) return BUZZ;
		else return String.valueOf(num);
	}
	
	

}
