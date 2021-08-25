package org.main.gfg.scala.algo.mathematics

import scala.io.StdIn._

object NumOfDigits extends App {
  val number = readLine()
  println("Count of digits ::: " + (math.log10(math.abs(number.toInt)).toInt +  1))
  println("Count of digits ::: " + number.length())
  
  
}