object StringFilter {
  def filterStrings(inputList: List[String]): List[String] = {
    inputList.filter(str => str.length > 5)
  }

  def main(args: Array[String]): Unit = {
    // Input list of strings
    val inputList = List("apple", "banana", "cherry", "date", "elephant", "fig")

    // Call the filterStrings function and print the result
    val filteredList = filterStrings(inputList)
    println(s"Input List: $inputList")
    println(s"Filtered List (length > 5): $filteredList")
  }
}

