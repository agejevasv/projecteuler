package projecteuler

import org.junit._
import Assert._

class Problem002Test {

  @Test def solutionByExampleData(): Unit = assertEquals(44, Problem002.solve(89))

  @Test def solution(): Unit = assertEquals(4613732, Problem002.solve(4000000))

}