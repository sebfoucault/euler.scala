//
// Problem #10
// https://projecteuler.net/problem=10

object Euler10 {


  val primes : Stream[Long] = Stream.range(2L,2000000L)
    .filter(x => (2 to Math.floor(Math.sqrt(x)).toInt).forall(y => x%y != 0))

  def main(args: Array[String]): Unit = {
    println(primes.toList.sum)
  }
}
