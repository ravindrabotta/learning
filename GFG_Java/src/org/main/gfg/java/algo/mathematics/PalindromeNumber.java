package org.main.gfg.java.algo.mathematics;

import java.util.*;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int sum = 0, number1 = number;
		while(number1 != 0) {
			sum = sum * 10 + number1%10;
			number1 = number1/10;
		}
		System.out.println(sum == number);
		System.out.println(palindrome(number, 0) == number);
		scan.close();
		
	}
	
	static int palindrome(int number, int sum) {
		if (number / 10 == 0) return (sum * 10 + number);
		return palindrome(number / 10, sum * 10 + number % 10);
	}
}
