package ch02gettingstarted

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class Exercise2_1Spec extends AnyFunSpec with Diagrams {
  describe("Exercise2_1") {
    it("return fibonacci number") {
      assert(Excercise2_1.fib(1) == 0)
      assert(Excercise2_1.fib(7) == 8)
    }
  }
}
