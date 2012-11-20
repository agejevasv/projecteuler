package projecteuler

import org.junit._
import Assert._

class Problem004Test {

  @Test def palindromes() {
    assertEquals(true, Problem004.isPalindrome(11))
    assertEquals(true, Problem004.isPalindrome(112211))
    assertEquals(true, Problem004.isPalindrome(909909))
    assertEquals(true, Problem004.isPalindrome(123454321))
    assertEquals(false, Problem004.isPalindrome(1234567))
  }

  @Test def solution() {
    assertEquals(906609, Problem004.solve())
  }

}