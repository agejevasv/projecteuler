package projecteuler

object Problem002 {
  
  def fib(n: Int): Int = n match {
    case 0 | 1 => n
    case _ => fib(n - 1) + fib(n - 2)
  }
  
  def solve(valueLimit: Int): Long = {
    var n, value, sum = 0
    
    while (value < valueLimit) {
      n += 1
      value = fib(n)
      if (value % 2 == 0) 
        sum += value
    }
    sum
  }

}
