#### Tasks for scala:
###### 1. Есть строка, нужно используя методы коллекций скалы, сгруппировать буквы по символу, отсортировать группы по количеству символов и сджойнить группы в одну строку.  
#
#
|         In|  Out  |
|-----------|-------|
|     `abcaba`| `aaabbc`|
|      `aacbc`|  `aaccb`|
|`asdasdaaaweqbbbbasdasd` | `aaaaaassssddddbbbbewq` |
* группы с одинаковым кол-вом символов могут быть в произвольном порядке, например “qwe” или “eqw”
#
###### 2. Написать функцию, которая будет проверять являются ли два дерева одинаковыми. Желателен рекурсивный подход без переменных.
#
# 
```scala
// Casse
case class TreeNode[X](value: X, left: Option[TreeNode[X]], right: Option[TreeNode[X]])
```
#
```scala
// Function
def isSameTree[X](p: Option[TreeNode[X]], q: Option[TreeNode[X]]): Boolean = {
    ???
  }
```
 #
 ```scala
 // Trees
 val simpleP = TreeNode(1, None, None)
 val simpleQ = TreeNode(1, None, None)
 
 assert(isSameTree(Some(simpleP), Some(simpleQ)))
 
 val p = TreeNode(1, Some(TreeNode(2, None, None)), None)
 val q = TreeNode(1, None, Some(TreeNode(2, None, None)))
 
 assert(!isSameTree(Some(p), Some(q)))
```


3. Написать программу, которая принимает строку в консоли и говорит это валидный email или нет 
