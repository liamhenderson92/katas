object ExamResults {

  def checkExamResults(correctAnswers: List[String], answers: List[String]): Int = correctAnswers.zip(answers).map(x => {
    x._2 match {
      case x._1 => 4
      case "" => 0
      case _ => -1
    }
  }).sum

}
