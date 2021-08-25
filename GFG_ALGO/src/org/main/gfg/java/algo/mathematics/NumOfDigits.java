package org.main.gfg.java.algo.mathematics;

import java.util.*;
import java.io.*;

public class NumOfDigits {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			System.out.println("Output of method 1 ::: " + countOfDigits1(number));
			System.out.println("Output of method 2 ::: " + countOfDigits2(number));
			System.out.println("Output of method 3 ::: " + countOfDigits3(number));
			System.out.println("Output of method 4 ::: " + countOfDigits4(number));
			System.out.println("Output of method 4 ::: " + countOfDigits5(number, 0));
		}
		
		static int countOfDigits1(int number) {
			int count = 0;
			while(number != 0) {
				number = number/10;
				++count;
			}
			return count;
		}
		
		static int countOfDigits2(int number) {
			if (number/10 == 0) return 1;
			return 1 + countOfDigits2(number/10);			
		}
		
		static int countOfDigits3(int number) {
			return Integer.toString(number).length();
		}
		
		static int countOfDigits4(int number) {
			return (int)Math.floor(Math.log10(number) + 1);
		}
		
		static int countOfDigits5(int number, int acc) {
			if (number / 10 == 0) return 1 + acc;
			return countOfDigits5(number / 10, 1 + acc);
		}
}
