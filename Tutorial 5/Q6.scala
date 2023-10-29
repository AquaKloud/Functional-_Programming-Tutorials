object Q6 {
  def main(args: Array[String]): Unit = {
    print("Enter your number - ")
    val number = scala.io.StdIn.readInt()
    printFibonacci(number)
  }

  def printFibonacci(number: Int): Unit = {
    for (i <- 0 until number) {
      print(fibonacci(i) +" ")
    }
  }

  def fibonacci(number: Int): Int = {
    if (number <= 1) number
    else fibonacci(number - 1) + fibonacci(number - 2)
  }
}
