//
// Problem #4
// https://projecteuler.net/problem=4

object Euler04 {

  def reverse(s: String): String = {
    if (s.isEmpty) "" else s.last + reverse(s.dropRight(1))
  }

  def isPalindrome(s: String): Boolean = {
    s.equals(reverse(s))
  }

  def isPalindrome(n: Int): Boolean = {
    isPalindrome(n.toString())
  }

  def greatestPalindrome(): Option[Int] = {
    (for { x <- (100 to 999); y <- (100 to 999) if x>=y } yield x*y).toList.sorted.reverse.find(x => isPalindrome(x))
  }

  def main(args: Array[String]): Unit = {
    println(greatestPalindrome())
  }
}
