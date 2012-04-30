package projecteuler

object Problem002 {
  
  def fib(n: Int): Int = n match {
    case 0 | 1 => n
    case _ => fib(n - 1) + fib(n - 2)
  }
  
  def solve(valueLimit: Int): Long = {
    var i = -1
    Stream.continually {i += 1; fib(i)}
      .takeWhile(_ <= valueLimit)
      .filter(_ % 2 == 0)
      .reduceLeft((a: Int, b: Int) => a + b)
  }

}
