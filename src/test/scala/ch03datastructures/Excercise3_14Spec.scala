package ch03datastructures

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Excercise3_14Spec extends AnyFunSpec with Diagrams {
  describe("Excercise3_14") {
    it("return appeded list") {
      assert(
        Excercise3_14.append(List(1, 2), List(3)) == List(1, 2, 3)
      )
    }
  }
}
