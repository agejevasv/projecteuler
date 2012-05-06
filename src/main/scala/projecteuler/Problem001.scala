package projecteuler

object Problem001 {
  
  def solve(lim: Int): Int =
    Set(0 until lim by 3: _*) ++ Set(0 until lim by 5: _*) reduceLeft(_ + _)
  
  def solve2(lim: Int): Int =
    (0 until lim) filter(x => x % 3 == 0 || x % 5 == 0) reduceLeft(_ + _)

}
