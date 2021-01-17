package ch03datastructures

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Excercise3_16Spec extends AnyFunSpec with Diagrams {
  describe("Excercise3_16") {
    it("return mapped list") {
      assert(Excercise3_16.map(List(1, 2, 3)) == List(2, 3, 4))
    }
  }
}
