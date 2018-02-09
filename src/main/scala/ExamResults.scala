object ExamResults {

  /* Write	a	function	that	takes	two	List[String]s,	one	representing	the	correct	answers	to
  a multiple	choice	exam,	the	other	representing	a	person's	answers,	and	returns	the	person's	score.
  They	get	4	points	for	a	correct	answer,	-1	for	an	incorrect	answer,	and	0	if	they	don't	answer
  (represented	by	an	empty string).	*/

  def checkExamResults(correctAnswers: List[String], answers: List[String]): Int = correctAnswers.zip(answers).map(x => {
    x._2 match {
      case x._1 => 4
      case "" => 0
      case _ => -1
    }
  }).sum

}
