package com.sks;

public class ThrowsClauseExample {

	public int division(int dividend, int divisor) throws ArithmeticException {

		int result = dividend / divisor;
		return result;

	}
	
	public int divisionCaller(int dividend, int divisor) throws ArithmeticException{
		return division(dividend, divisor);
	}

	public static void main(String[] args) {

		ThrowsClauseExample obj = new ThrowsClauseExample();
		try {
		obj.divisionCaller(12, 0);
		throw new NullPointerException();
		}catch (Exception e) {
			System.out.println("Handled.");
		}
		
		System.out.println("After exception is thrown.");
		
		throw new NullPointerException();
	}

}
