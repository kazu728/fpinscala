package ch03datastructures

import Excercise3_10._

object Excercise3_11 {

  def sum(list: List[Int]): Int = foldLeft(list, 0)((a, b) => b + a)

  def product[A](list: List[Double]) = foldLeft(list, 1.0)((a, b) => b * a)

  def length[A](list: List[A]): Int = foldLeft(list, 0)((acc, _) => acc + 1)
}
