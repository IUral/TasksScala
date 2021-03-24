package firstTask

import scala.collection.mutable


class StringGroupBySortJoin extends IStringGroupBySortJoin {

  @Override
  def declarativeStyleGroupBySortJoin(str: String): String = {
    val cache: mutable.HashMap[Char, Int] = mutable.HashMap()
    var result = ""
    for(char <- str) {
      if(!cache.contains(char)) {
        cache.update(char, 1)
      } else {
        cache.update(char, cache(char) + 1)
      }
    }
    val listMap: List[(Char, Int)] = cache.toList
    val sortedListMap = listMap.sortWith((a: (Char, Int) , b: (Char, Int)) => a._2.compareTo(b._2) > 0)
    for(entry <- sortedListMap) {
      result += entry._1.toString * entry._2
    }
    result
  }

  @Override
  def functionStyleGroupBySortJoin(str: String): String = {
    str.groupBy(identity)
      .toList
      .sortBy(-_._2.length)
      .foldLeft("")((str: String, tuple: (Char, String)) => str + tuple._2)
  }

}
