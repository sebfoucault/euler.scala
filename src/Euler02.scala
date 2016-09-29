//
// Problem #2
// https://projecteuler.net/problem=2

object Euler02 {

  def sumFibo(max: Int): Int = {
    def compute(currentSum: Int, l: List[Int]): Int = {
      l match {
        case first :: rest if first > max => currentSum
        case first :: second :: rest if (first + second ) % 2 == 0 => compute(currentSum+first+second, first+second :: l)
        case first :: second :: rest => compute(currentSum, first+second :: l)
      }
    }
    compute(2, List(2,1))
  }

  def main(args: Array[String]): Unit = {
    println(sumFibo(4000000))
  }
}
