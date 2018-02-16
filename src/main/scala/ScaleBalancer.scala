class BalanceNotPossibleException extends Exception

object ScaleBalancer {

  /*
  * A function that will return a String of one or two numbers which
  * represent the values needed to balance a pair of weights on a scale.
  *
  * input format: "[1,2], [4,5,6]"
  *  - [1,2] represents weights to be balanced
  *  - [4,5,6] represents the weights available to achieve this balance
  * */

  def balance(input: String): String = {


    val splitString: Array[String] = input.split("\\],\\[")

    val firstList: Array[Int] = splitString(0).replace("[", "").replace("]","").split(",").map(_.toInt)

    val a = firstList(0)
    val b = firstList(1)

    if (splitString(1).toString == "]") throw new BalanceNotPossibleException

    val secondList: Array[Int] = splitString(1).replace("]", "").split(",").map(_.toInt)

//    if (a != b){
//      throw new BalanceNotPossibleException
//    }

    val arrayLength = secondList.length

    print(secondList.foreach(println(_)))
    println(arrayLength)

//    println(firstList(0))
//    println(firstList(1))
//    println(secondList.length)

    val x = if (secondList.contains(firstList.max - firstList.min)){
      (firstList.max - firstList.min).toString
    } else { "" }
    x
  }

}

