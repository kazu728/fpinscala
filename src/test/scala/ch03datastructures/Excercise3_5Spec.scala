package ch03datastructures

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Excercise3_5Spec extends AnyFunSpec with Diagrams {
  describe("Excercise3_5") {
    it("return duplicated list") {
      assert(
        Excercise3_5.dropWhile(List(1, 2, 3), (a: Int) => a == 2) == Cons(
          3,
          Nil
        )
      )
    }
  }
}
