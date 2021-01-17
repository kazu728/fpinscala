package ch03datastructures

object Excercise3_14 {
  def append[A, B](as: List[A], bs: List[A]): List[A] =
    List.foldRight(as, bs)(Cons(_, _))
}
