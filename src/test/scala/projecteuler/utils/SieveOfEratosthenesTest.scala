package projecteuler.utils

import org.junit._
import Assert._

class SieveOfEratosthenesTest {
  
  @Test def primesUpTo10 {
    val primes = Array[Int](2, 3, 5, 7)
    var i = 0
    for (prime <- SieveOfEratosthenes(10).primes) {
      assertEquals(primes(i), prime)
      i += 1
    }
  }
  
  @Test def isPrime {
    assertTrue(SieveOfEratosthenes(1000) isPrime 983)
  }
  
  @Test(expected = classOf[IllegalStateException])
  def isPrimeWithOverflow {
    SieveOfEratosthenes(100) isPrime 983
  }
}
