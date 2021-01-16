package ch03datastructures

import Excercise3_10._

object Excercise3_12 {

  def reverse[A](l: List[A]): List[A] =
    foldLeft(l, List[A]())((x, xs) => Cons(xs, x))
}
