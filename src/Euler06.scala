

object Euler06 {

  def sumSquareDiff(i: Int): Int = {
    val sum = (0 to i).foldLeft(0)(_+_)
    val squaredSum = sum*sum
    val sumSquared = (0 to i).map(x => x*x).foldLeft(0)(_+_)
    squaredSum - sumSquared
  }

  def main(args: Array[String]): Unit = {
    println(sumSquareDiff(100))
  }
}
