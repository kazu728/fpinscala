package ch03datastructures

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Excercise3_6Spec extends AnyFunSpec with Diagrams {
  describe("Excercise3_6") {
    it("return duplicated list") {
      assert(Excercise3_6.init(List(1, 2, 3)) == Cons(1, Cons(2, Nil)))
    }
  }
}
