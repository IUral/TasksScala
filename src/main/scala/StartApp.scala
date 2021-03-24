import firstTask.StringGroupBySortJoin
import secondTask.TreesCompare
import thirdTask.EmailValid

object StartApp {
  def main(args: Array[String]): Unit ={


    /*
     *    First Task
     */
    val str1 = "abcaba" -> "aaabbc"
    val str2 = "aacbc" -> "aaccb"
    val str3 = "asdasdaaaweqbbbbasdasd" -> "aaaaaaassssddddbbbbewq"
    val firstTask = new StringGroupBySortJoin

    assert(str1._2 == firstTask.functionStyleGroupBySortJoin(str1._1))
    assert(str2._2 == firstTask.functionStyleGroupBySortJoin(str2._1))
    assert(str3._2 == firstTask.functionStyleGroupBySortJoin(str3._1))


    /*
     *    Second Task
     */
    val secondTask = new TreesCompare

    val simpleP = secondTask.TreeNode(1, None, None)
    val simpleQ = secondTask.TreeNode(1, None, None)

    assert(secondTask.isSameTree(Some(simpleP), Some(simpleQ)))

    val p = secondTask.TreeNode(1, Some(secondTask.TreeNode(2, None, None)), None)
    val q = secondTask.TreeNode(1, None, Some(secondTask.TreeNode(2, None, None)))

    assert(!secondTask.isSameTree(Some(p), Some(q)))


    /*
     *    Third Task
     */
    val thirdTask = new EmailValid
    val emailIn = thirdTask.runConsole("Please enter your email: ")

    println(thirdTask.emailValidate(emailIn))

  }

}
