object Partridge {

  def part(args: Array[String]): String = {
    val terms = List("PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad", "Partridge")
    val some = "Mine's a Pint"
    val none = "Lynn, I've pierced my foot on a spike!!"
    val intersect: List[String] = args.toList.intersect(terms)

    if (intersect.nonEmpty) {
      some + ("!" * intersect.size)
    } else {
      none
    }
  }

  def apple(x: Any): String = {
    val yorkie = "Help yourself to a honeycomb Yorkie for the glovebox"
    val hot = "It's hotter than the sun!!"

    val num: Int = x match {
      case i: Int => i
      case s: String => s.toInt
    }

    if(num * num > 1000) hot else yorkie
  }

  def london(args: Array[String]): String = {
    val stations = Set("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway")
    val cheese = "Smell my cheese you mother!"
    val run = "No, seriously, run. You will miss it."

    if(stations.subsetOf(args.toSet)) cheese else run
  }

}
