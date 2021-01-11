package ch03datastructures

object Excercise3_6 {

  def init[A](l: List[A]): List[A] = l match {
    case Cons(x, Nil) => Nil
    case Cons(x, xs)  => Cons(x, init(xs))
    case Nil          => Nil
  }
}
