package ch03datastructures

object Excercise3_17 {

  def map(l: List[Double]): List[String] = {
    l match {
      case Cons(x, xs) => Cons(x.toString, map(xs))
      case Nil         => Nil
    }
  }
}
