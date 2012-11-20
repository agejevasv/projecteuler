package projecteuler

object Problem004 {

  def isPalindrome(number: Int): Boolean = {
    // ugly procedural impl, try some functional approach
    var n = number;
    var reversed = 0;

    while (n > 0) {
      reversed = (reversed * 10) + (n % 10);
      n /= 10;
    }

    number == reversed
  }

  def solve(): Int = {
    val palindromes = for (
      a <- (100 until 1000);
      b <- (a until 1000);
      p = a * b if isPalindrome(p)
    ) yield p

    palindromes.toList.sortWith(_ > _).head
  }

}
