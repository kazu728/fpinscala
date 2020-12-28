import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class MainSpec extends AnyFunSpec with Diagrams {

  describe("Main") {

    it("return second to last element with some elements") {
      assert(Main.hello == "Hello world")
    }
  }
}
