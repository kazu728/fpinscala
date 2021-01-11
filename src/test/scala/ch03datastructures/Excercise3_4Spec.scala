package ch03datastructures

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Excercise3_4Spec extends AnyFunSpec with Diagrams {
  describe("Execrcise3_4") {
    it("return dropped list") {
      assert(Excercise3_4.drop(List(1, 2, 3), 2) == Cons(3, Nil))

      assert(
        Excercise3_4.drop(List(1, 2, 3, 9, 32, 41), 3) == Cons(
          9,
          Cons(32, Cons(41, Nil))
        )
      )
    }
  }
}
