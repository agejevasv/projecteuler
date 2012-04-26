package projecteuler

object Problem001 {
  
  def solve(): Int = { 
    val set = Set((0 until 1000 by 3): _*) ++ Set((0 until 1000 by 5): _*)
    set reduceLeft((a:Int, b:Int) => a + b)
  }
}
