package org.main.gfg.java.algo.mathematics;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(factorial(number, 1));
		
		
		
	}
	
	static int factorial(int number, int acc) {
		if (number <= 1) return acc;
		return factorial(number - 1, number * acc);
	}
}
