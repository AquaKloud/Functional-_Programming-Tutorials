object Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter your integer number - ")
    val givenNumber = scala.io.StdIn.readInt()

    patternMatching(givenNumber)
  }

  def patternMatching(givenNumber: Int): Unit = {
    givenNumber match {
      case number if number <= 0 => println("Given number is a NEGATIVE NUMBER")
      case number if number == 0 => println("Given number is ZERO")
      case _ =>
    }

    givenNumber match {
      case number if number % 2 == 0 => print("Given number is an EVEN NUMBER")
      case _ => print("Given number is an ODD NUMBER")
    }
  }
}
