//
// Problem #9
// https://projecteuler.net/problem=9

object Euler09 {

  def sqr(x:Int) = x*x

  def main(args: Array[String]): Unit = {
    val x = (for(i <- (1 to 999); j<-(1 to 999)) yield (i,j))
      .map(p => (p._1,p._2,1000-p._1-p._2))
      .filter(t => sqr(t._1)+sqr(t._2)==sqr(t._3))
      .map(t => t._1*t._2*t._3)
    println(x.head)
  }
}
