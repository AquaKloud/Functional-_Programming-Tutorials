object Q1 {
  def main(args: Array[String]): Unit = {
    println("Enter temperatures in celsius (one per line)\npress Enter on an empty line to finish")

    val userInputList = readInputs()
    println("User input list: " + userInputList)

    println("Average Fahrenheit temperature: " + calculateAverage(userInputList) + "F")
  }

  def readInputs(): List[Double] = {
    val input = scala.io.StdIn.readLine()
    if (input.isEmpty) {
      Nil
    }
    else {
      val temp = input.toDouble
      temp :: readInputs()
    }
  }

  def calculateAverage(temperatureCelsius : List[Double]): Double = {
    val temperatureFahrenheit = temperatureCelsius.map(c => c * (9 / 5) + 32)
    val sum = temperatureFahrenheit.reduce((a, b) => a + b)

    sum / temperatureFahrenheit.length
  }
}
