//
// Problem #5
// https://projecteuler.net/problem=5

object Euler05 {

  def smallestMultiple(): Option[Int] = {
    Stream.from(20,20).find(x => (2 to 20).forall(i => x % i == 0))
  }

  def main(args: Array[String]): Unit = {
    println(smallestMultiple())
  }
}
