//
// Problem #7
// https://projecteuler.net/problem=7

object Euler07 {

  val primes : Stream[Int] = Stream.from(2).filter(x => (2 to x/2).find(y => x%y == 0).isEmpty)

  def main(args: Array[String]): Unit = {
    println(primes.drop(10000).head)
  }
}
