import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite
import secondTask.TreesCompare


class SecondTaskTestSuite extends AnyFunSuite with BeforeAndAfter{

  val secondTask = new TreesCompare

  val simpleP: secondTask.TreeNode[Int] = secondTask.TreeNode(1, None, None)
  val simpleQ: secondTask.TreeNode[Int] = secondTask.TreeNode(1, None, None)

  val p: secondTask.TreeNode[Int] = secondTask.TreeNode(1, Some(secondTask.TreeNode(2, None, None)), None)
  val q: secondTask.TreeNode[Int] = secondTask.TreeNode(1, None, Some(secondTask.TreeNode(2, None, None)))

  test("trees equal") {
    assert(secondTask.isSameTree(Some(simpleP), Some(simpleQ)))
  }

  test("trees not equal") {
    assert(!secondTask.isSameTree(Some(p), Some(q)))
  }
}
