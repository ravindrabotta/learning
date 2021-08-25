package org.main.gfg.java.algo.mathematics;

import java.util.Scanner;

public class GreatestCommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(gcf(num1, num2));
		scan.close();
	}
	
	static int gcf(int num1, int num2) {
		if (num2 == 0) return num1;
		return gcf(num2, num1%num2);
	}

}
