package secondTask

class TreesCompare extends ITreesCompare {

  def isSameTree[X](p: Option[TreeNode[X]], q: Option[TreeNode[X]]): Boolean = Array(p,q) match {
    case Array(Some(x), Some(y))
      if ((Some(x).isDefined && Some(y).isDefined)
        && (Some(x).get.value == Some(y).get.value)
        && isSameTree(Some(x).get.left, Some(y).get.left)
        && isSameTree(Some(y).get.right, Some(y).get.right)) => true
    case Array(Some(x), None) => false
    case Array(None, Some(y)) => false
    case Array(None, None) => true
    case _ => false
  }

}
