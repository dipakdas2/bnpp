package com.bnpp.assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzAppTest {
	
	FizzBuzzApp fizzBuzz;
	
	private static String FIZZ = "fizz";
	private static String BUZZ = "buzz";
	private static String FIZZ_BUZZ = "fizz buzz";
	
	@Before
	public void setUp(){
	  fizzBuzz = new FizzBuzzApp();
	}
	
	@Test
	public void readNumberTest(){
		//Number not divisible by either 3 or 5 or both
		int num = 11;
		String result = fizzBuzz.readNumber(num);
		Assert.assertEquals(String.valueOf(num), result);
	}
	
	@Test
	public void testFizz(){
		int num = 3; //Number only divisible by 3
		String result = fizzBuzz.readNumber(num);
		Assert.assertEquals(FIZZ, result);
	}
	
	@Test
	public void testBuzz(){
		int num = 10; //Number only divisible by 5
		String result = fizzBuzz.readNumber(num);
		Assert.assertEquals(BUZZ, result);
	}
		
	@Test
	public void testFizzBuzz(){
		int num = 45; //Number divisible by 3 and 5
		String result = fizzBuzz.readNumber(num);
		Assert.assertEquals(FIZZ_BUZZ, result);
	}
	
	

}
