
object StringReverser {
  def reverseString(input: String): String = {
    if (input.isEmpty) {
      // Base case: If the string is empty, return an empty string.
      ""
    } else {
      // Recursive case: Reverse the rest of the string and append the first character.
      reverseString(input.tail) + input.head
    }
  }

  def main(args: Array[String]): Unit = {
    // Input string
    val inputString = "Hello, World!"

    // Call the reverseString function and print the result
    val reversedString = reverseString(inputString)
    println(s"Original string: $inputString")
    println(s"Reversed string: $reversedString")
  }
}
