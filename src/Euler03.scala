//
// Problem #3
// https://projecteuler.net/problem=3

object Euler03 {

  def primeFactors(i: Long): List[Long] = {
    if (i < 2)
      Nil
    else if (i == 2)
      List(2)
    else {
      val divisor = Stream.range(2L, i / 2).find(p => i % p == 0)
      if (divisor.isEmpty) {
        List(i)
      } else {
        (primeFactors(i / divisor.get) ::: primeFactors(divisor.get)).sorted.reverse
      }
    }
  }

  def greatestPrimeFactor(i: Long): Long = {
    primeFactors(i).head
  }

  def main(args: Array[String]): Unit = {
    println(greatestPrimeFactor(600851475143L))
  }
}
