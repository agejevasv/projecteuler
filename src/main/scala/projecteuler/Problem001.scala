package projecteuler

object Problem001 {
  
  def solve(limit: Int): Int = { 
    val set = Set((0 until limit by 3): _*) ++ Set((0 until limit by 5): _*)
    set.reduceLeft((a: Int, b: Int) => a + b)
  }
}
