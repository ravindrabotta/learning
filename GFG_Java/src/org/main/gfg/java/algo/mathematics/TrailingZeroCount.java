package org.main.gfg.java.algo.mathematics;

import java.util.Scanner;

public class TrailingZeroCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("No of trailing Zeros " + trailingCount(num, 0, 5));
	}
	
	static int trailingCount(int num, int sum, int i) {
		if (num / i == 0) return sum;
		return trailingCount(num, sum += num/i, i * 5);
	}

}
