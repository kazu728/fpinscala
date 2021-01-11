package ch03datastructures

object Excercise3_4 {

  def drop[A](l: List[A], n: Int): List[A] = l match {
    case Cons(x, xs) if n > 0 => drop(xs, n - 1)
    case x if n == 0          => x
    case Nil                  => List()
  }
}
