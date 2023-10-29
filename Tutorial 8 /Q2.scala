object Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter your integer number - ")
    val givenNumber: Int = scala.io.StdIn.readInt()

    patternMatching(givenNumber)
  }

  val patternMatching: Int => Unit = (givenNumber: Int) => {
    givenNumber match {
      case givenNumber if givenNumber < 0 => println("Given number is a NEGATIVE NUMBER")
      case givenNumber if givenNumber == 0 => println("Given number is ZERO")
      case _ =>
    }

    givenNumber match {
      case givenNumber if givenNumber % 2 == 0 => print("Given number is an EVEN NUMBER")
      case _ => print("Given number is an ODD NUMBER")
    }
  }
}
