package com.sks;

public class BitwiseOperatorsExample {

	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int bitwiseAndResult = a & b;
		System.out.println("Bitwise And result is : " + bitwiseAndResult);
		int bitwiseOrResult = a | b;
		System.out.println("Bitwise Or result is : " + bitwiseOrResult);
		int bitwiseXorResult = a ^ b;
		System.out.println("Bitwise Xor result is : " + bitwiseXorResult);
		int bitwiseNotResult = ~a;
		System.out.println("Bitwise Not result is : " + bitwiseNotResult);
	}
}
