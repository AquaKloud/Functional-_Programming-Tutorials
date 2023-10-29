object AverageCalculator {
  def calculateAverage(num1: Int, num2: Int): Double = {
    val sum = num1 + num2
    val average = BigDecimal(sum.toDouble / 2).setScale(2, BigDecimal.RoundingMode.HALF_UP)
    average.toDouble
  }

  def main(args: Array[String]): Unit = {
    // Test the calculateAverage function with two integers
    val num1 = 10
    val num2 = 15

    val average = calculateAverage(num1, num2)
    println(s"The average of $num1 and $num2 is $average")
  }
}

