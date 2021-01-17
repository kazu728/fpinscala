package ch03datastructures

object Excercise3_16 {

  def map(as: List[Int]): List[Int] = {
    as match {
      case Cons(x, xs) => Cons(x + 1, map(xs))
      case Nil         => Nil
    }
  }
}
