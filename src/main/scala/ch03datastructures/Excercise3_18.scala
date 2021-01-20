package ch03datastructures

object Excercise3_18 {

  def map[A, B](as: List[A])(f: A => B): List[B] =
    List.foldRight(as, Nil: List[B])((a, b) => Cons(f(a), b))
}
