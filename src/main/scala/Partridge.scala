object Partridge {

  val terms = List("PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad", "Partridge")
  val some = "Mine's a Pint"
  val none = "Lynn, I've pierced my foot on a spike!!"

  def part(args: Array[String]): String = {
    val intersect: List[String] = args.toList.intersect(terms)
    if (intersect.nonEmpty) {
      some + ("!" * intersect.size)
    } else {
      none
    }
  }

}
