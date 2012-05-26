package projecteuler

object Problem002 {
  
  def fib(n: Int): Int = n match {
    case 0 | 1 => n
    case _ => fib(n - 1) + fib(n - 2)
  }
  
  def solve(valueLimit: Int): Long = {
    Stream
      .from(0)
      .map(i => fib(i))
      .takeWhile(_ <= valueLimit)
      .filter(_ % 2 == 0)
      .reduceLeft(_ + _)
  }

}
