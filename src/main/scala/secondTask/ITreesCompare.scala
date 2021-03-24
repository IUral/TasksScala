package secondTask

trait ITreesCompare {
  sealed abstract class Tree
  case class TreeNode[X](value: X, left: Option[TreeNode[X]], right: Option[TreeNode[X]]) extends Tree
  def isSameTree[X](p: Option[TreeNode[X]], q: Option[TreeNode[X]]): Boolean

}
