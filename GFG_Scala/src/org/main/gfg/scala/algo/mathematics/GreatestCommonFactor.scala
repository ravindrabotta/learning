package org.main.gfg.scala.algo.mathematics

import java.util.Scanner;

object GreatestCommonFactor extends App {
  
	val scan = new Scanner(System.in)
	val num1 = scan.nextInt()
	val num2 = scan.nextInt()
	
	def gcf(num1: Int, num2: Int): Int = {
		if (num2 == 0) num1
		else gcf(num2, num1 % num2)
	}
	
	println(gcf(num1, num2))
}