package projecteuler

object Problem004 {

  def isPalindrome(number: Int) =
     number == reverse(number)

  def reverse(number: Int, reversed: Int = 0): Int =
    if (number == 0)
      reversed
    else
      reverse(number / 10, reversed * 10 + number % 10)

  def solve(): Int = {
    val palindromes = for (
      a <- (100 until 1000);
      b <- (a until 1000);
      p = a * b if isPalindrome(p)
    ) yield p

    palindromes.toList.sortWith(_ > _).head
  }

}
