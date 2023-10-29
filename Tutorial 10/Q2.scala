object Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter words(one per line)\npress Enter on an empty line to finish")

    val userInputList = readInputs()
    println("User input list: " + userInputList)

    println("Total count of letter occurrences: " +countLetterOccurrences(userInputList))
  }

  def readInputs(): List[String] = {
    val input = scala.io.StdIn.readLine()
    if (input.isEmpty) {
      Nil
    }
    else {
      input :: readInputs()
    }
  }

  def countLetterOccurrences(words: List[String]): Int = {
    val wordLength = words.map(_.length)
    val total = wordLength.reduce(_+_)

    total
  }
}
