object Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter a list of integers separated by spaces: ")
    val inputString = scala.io.StdIn.readLine()
    val integersList = inputString.split(" ").map(_.toInt).toList

    print("Square number List : " +calculateSquare(integersList))
  }

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num*num)
  }
}
