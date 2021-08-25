package org.main.gfg.scala.algo.mathematics

import java.util.Scanner;

object Factorial extends App {
  val scan = new Scanner(System.in)
  val num = scan.nextInt()
  
  def fact(num: Int, acc: Int): Int = {
	  if (num <= 1) acc
	  else fact(num - 1, num * acc)
  }
  
  println(fact(num, 1))
}