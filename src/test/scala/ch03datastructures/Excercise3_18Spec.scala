package ch03datastructures

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Excercise3_18Spec extends AnyFunSpec with Diagrams {
  describe("it return mapped value") {
    it("Excercise3_18") {
      assert(Excercise3_18.map(List(1, 2, 3))(a => a * 3) == List(3, 6, 9))
    }
  }
}
