/**
  * Problem #12
  * [[https://projecteuler.net/problem=12]]
  */
object Euler12 {

  def divisorCount(n:Long): Long = {
    // * 2 since we stop at the middle of the divisor field
    // for 1 and n itself
    (2L to Math.sqrt(n).toLong).toList.filter(x=> n % x == 0).length * 2 + 2
  }

  def main(args: Array[String]): Unit = {
    val triangleNumbers = Stream.from(0).scanLeft(0)(_+_).tail
    val s = triangleNumbers.filter(t=>divisorCount(t)>500).head
    println(s)
  }
}
