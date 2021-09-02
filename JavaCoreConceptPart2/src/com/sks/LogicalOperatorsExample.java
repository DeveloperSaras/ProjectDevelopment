package com.sks;

public class LogicalOperatorsExample {

	public static void main(String[] args) {

		int a = 20;
		int b = 10;
		int c = 100;

		System.out.println("a lies between a and B ? " + (a > b && a < c));

		int d = 35;
		int e = 30;
		int f = 40;

		System.out.println("d is either less than e or f ? " + (d < e || d < f));

		int x = 50;
		int y = 60;

		System.out.println("x equals to y ? " + !(x == y));
	}
}
