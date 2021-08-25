package org.main.gfg.scala.algo.mathematics

import java.util._
import scala.annotation.tailrec

object PalindromeNumber extends App {
  val scan = new Scanner(System.in)
  val number = scan.nextInt
  var sum = 0
  var temp = number
  while(temp != 0) {
    sum = sum * 10 + temp%10
    temp = temp/10
  }
  println(sum == number)
  
  @tailrec
  def palindromeNo(n: Int, sum: Int = 0): Int = {
	  if (n / 10 == 0) sum * 10 + n
	  else palindromeNo(n / 10, sum * 10 + n % 10)
  }
  
  println(palindromeNo(number))
  println(palindromeNo(number) == number)
}
