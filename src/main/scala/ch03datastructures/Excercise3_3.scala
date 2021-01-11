package ch03datastructures

object Excercise3_3 {

  def setHead[A](l: List[A], a: A) = l match {
    case Nil         => sys.error("")
    case Cons(x, xs) => Cons(a, xs)
  }
}
