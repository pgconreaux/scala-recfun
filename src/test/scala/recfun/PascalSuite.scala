package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PascalSuite extends FunSuite {
  import Main.pascal
  test("pascal: col=0,row=2") {
    assert(pascal(0, 2) === 1)
  }

  test("pascal: col=1,row=2") {
    assert(pascal(1, 2) === 2)
  }

  test("pascal: col=1,row=3") {
    assert(pascal(1, 3) === 3)
  }

  test("pascal: col=0,row=0") {
    assert(pascal(0, 0) === 1)
  }

  test("pascal: col=0,row=1") {
    assert(pascal(0, 1) === 1)
  }

  test("pascal: col=3,row=0") {
    intercept[IllegalArgumentException] {
      assert(pascal(3, 0) === 0)
    }
  }

  test("pascal: col=4,row=2") {
    intercept[IllegalArgumentException] {
      assert(pascal(4, 2) === 0)
    }
  }

  test("pascal: col=2,row=4") {
    assert(pascal(2, 4) === 6)
  }
  
  test("pascal: col=5,row=10") {
    assert(pascal(5, 10) === 252)
  }

  test("pascal: col=1,row=-1") {
    intercept[IllegalArgumentException] {
      assert(pascal(1, -1) === 0)
    }
  }

  test("pascal: col=-1,row=-1") {
    intercept[IllegalArgumentException] {
      assert(pascal(-1, -1) === 0)
    }
  }

}
