package ch02gettingstarted

object Excercesi2_2 {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

    def go(n: Int): Boolean = {
      if (n >= as.length) false
      else if (ordered(as(n), as(n + 1))) true
      else go(n + 1)
    }

    go(0)
  }
}
