package projecteuler

import scala.math._

object Problem003 {
  
  def isPrime(n:Double): Boolean = {
    for(i <- 2 until n.toInt)
      if (n % i == 0)
        return false
    true
  }
  
  def solve(n:Double): Int = {
    val root = floor(sqrt(n))
    
    for (i <- root to 1 by -1)
      if (n % i == 0 && isPrime(i))
        return i.toInt
    1
  }

}
