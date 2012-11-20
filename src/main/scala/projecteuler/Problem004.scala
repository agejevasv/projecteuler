package projecteuler

object Problem004 {

  def isPalindrome(num: Int): Boolean = {
    // ugly procedural impl, try some functional approach
    var x = num;
    var rev = 0;

    while (x > 0) {
      rev = (rev * 10) + (x % 10);
      x = x / 10;
    }

    num == rev
  }

}
