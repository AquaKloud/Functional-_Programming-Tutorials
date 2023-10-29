object Q3 {
  def main(args : Array[String]): Unit = {
    val inputName = scala.io.StdIn.readLine("Enter the name that you want to format - ")

    println()
    println("1 - Format the name to uppercase")
    println("2 - Capitalize the second letter of the name")
    println("3 - Format the name to lowercase")
    println("4 - Capitalize the last letter of the name")
    println()

    print("Enter your choice - ")
    val choice = scala.io.StdIn.readInt()

    val formattedName = selectChoice(choice, inputName)
    println("Formatted based on the provided formatFunction - " + formattedName)
  }

  def toUpper(inputString : String): String = {
    inputString.toUpperCase
  }

  def toLower(inputString : String) : String ={
    inputString.toLowerCase
  }

  def formatNames(name: String, formatFunction: String => String): String = {
    formatFunction(name)
  }

  def selectChoice(choice : Int, inputName : String): String = {
    choice match {
      case 1 => formatNames (inputName, toUpper)
      case 2 => formatNames (inputName, str => str.head + (str.charAt(1).toUpper + str.drop(2)))
      case 3 => formatNames (inputName, toLower)
      case 4 => formatNames (inputName, str => str.init + str.last.toUpper)
      case _ => "You made an Invalid choice"
    }
  }
}
