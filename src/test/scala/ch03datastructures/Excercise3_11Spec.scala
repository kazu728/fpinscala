package ch03datastructures

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

import Excercise3_11._

class Excercise3_11Spec extends AnyFunSpec with Diagrams {
  val list =
    describe("Excercise3_11") {
      it("return calculated value") {
        assert(sum(List(1, 2, 3, 4)) == 10)
        assert(product(List(1.0, 2.0, 3.0)) == 6.0)
        assert(length(List(1, 2, 3, 4, 5, 6)) == 6)
      }
    }
}
