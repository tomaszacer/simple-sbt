package pl.gigiel.simple.sbt

import org.scalatest.FlatSpec

class SimpleAppSpec extends FlatSpec {
  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }
}
