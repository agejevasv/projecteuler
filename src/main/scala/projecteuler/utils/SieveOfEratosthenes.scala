package projecteuler.utils

import collection.mutable.BitSet

class SieveOfEratosthenes(val n: Int) {
  
  val numbers = 2 to n
  val sieve = BitSet(numbers: _*)
  
  for (p <- numbers takeWhile (x => x * x <= n) if sieve(p))
    sieve --= p * p to n by p
  
  def primes = sieve
  
  def isPrime(number: Int) = {
    if (number <= n)
      sieve contains number
    else 
      throw new IllegalStateException(number + " is too big for sieve of " + n) 
  }
}

object SieveOfEratosthenes {
  
  def apply(n: Int = 10000) = new SieveOfEratosthenes(n)
  
}
