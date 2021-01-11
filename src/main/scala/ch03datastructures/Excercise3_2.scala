package ch03datastructures

object Excercise3_2 {

  def tail[A](l: List[A]): List[A] = l match {
    case Nil         => sys.error("")
    case Cons(x, xs) => xs
  }
}
