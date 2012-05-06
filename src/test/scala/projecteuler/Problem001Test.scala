package projecteuler

import org.junit._
import Assert._

class Problem001Test {

  @Test def solutionByExampleData() {
    assertEquals(23, Problem001.solve(10))
  }
  
  @Test def solution() {
    assertEquals(233168, Problem001.solve(1000))
  }
  
  @Test def solution2() {
    assertEquals(233168, Problem001.solve2(1000))
  }

}