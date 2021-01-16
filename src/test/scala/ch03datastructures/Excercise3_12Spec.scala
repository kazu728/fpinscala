package ch03datastructures

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Excercise3_12Spec extends AnyFunSpec with Diagrams {
  describe("Excercise3_12") {
    it("return reversed list") {
      assert(Excercise3_12.reverse(List(1, 2, 3)) == List(3, 2, 1))
    }
  }
}
