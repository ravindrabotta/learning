package org.main.gfg.scala.algo.mathematics

import java.util.Scanner;

object TrailingZeros extends App {
	val scan = new Scanner(System.in)
	val number = scan.nextInt()
	
	def trailingCount(number: Int, sum: Int, index: Int): Int = {
		if (number / index == 0) sum
		else trailingCount(number, sum + number / index, 5 * index)
	}
	
	println(trailingCount(number, 0, 5))
  
}