package projecteuler

import org.junit._
import Assert._

class Problem004Test {

  @Test def palindromes() {
    assertEquals(true, Problem004.isPalindrome(11))
  }

}