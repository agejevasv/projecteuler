package projecteuler

import org.junit._
import Assert._

class Problem003Test {

  @Test def primes() {
    assertTrue(Problem003.isPrime(5))
    assertTrue(Problem003.isPrime(7))
    assertTrue(Problem003.isPrime(13))
    assertTrue(Problem003.isPrime(29))
    assertFalse(Problem003.isPrime(30))
  }

  @Test def solutionByExampleData() {
    assertEquals(29, Problem003.solve(13195))
  }
  
  @Test def solution() {
    assertEquals(6857, Problem003.solve(600851475143.0))
  }

}