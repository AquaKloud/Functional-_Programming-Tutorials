object Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter a list of integers separated by spaces: ")
    val inputString = scala.io.StdIn.readLine()
    val integersList = inputString.split(" ").map(_.toInt).toList

    print("Filtered List : " +filterEvenNumbers(integersList))
  }

  def filterEvenNumbers(numbers : List[Int]): List[Int] = {
    numbers.filter(num => num%2 == 0)
  }
}
