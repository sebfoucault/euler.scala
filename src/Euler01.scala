object Euler01 {

  def sum(max: Int, divisors: List[Int]) = {
    (0 to max-1).toList.filter(x => divisors.filter(div => x % div == 0).size > 0).foldLeft(0)(_ + _)
  }

  def main(args: Array[String]): Unit = {
    println(sum(1000,List(3,5)))
  }
}
