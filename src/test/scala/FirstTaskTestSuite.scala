import firstTask.StringGroupBySortJoin
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.BeforeAndAfter

import scala.collection.mutable


class FirstTaskTestSuite extends AnyFunSuite with BeforeAndAfter{

  val operation = new StringGroupBySortJoin()

  test("grouped string characters, functional style") {
    val hashMap = mutable.HashMap[String, String](
      ("abcaba", "aaabbc"),
      ("aacbc", "aaccb"),
      ("asdasdaaaweqbbbbasdasd", "aaaaaaassssddddbbbbewq")
    )
    hashMap.foreach((entry: (String, String)) =>
      assert(operation.functionStyleGroupBySortJoin(entry._1) == entry._2))
  }

  test("grouped string characters, declarative style") {
    val hashMap = mutable.HashMap[String, String](
      ("abcaba", "aaabbc"),
      ("aacbc", "aaccb"),
      ("asdasdaaaweqbbbbasdasd", "aaaaaaabbbbssssddddqew")
    )
    hashMap.foreach((entry: (String, String)) =>
      assert(operation.declarativeStyleGroupBySortJoin(entry._1) == entry._2))
  }
}
