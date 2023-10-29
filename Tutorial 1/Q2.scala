object CelsiusToFahrenheit {
  def main(args: Array[String]): Unit = {
    // Define the temperature in Celsius
    val celsius = 35.0

    // Convert to Fahrenheit
    val fahrenheit = celsius * 1.8 + 32.0

    // Print the result
    println(s"$celsius degrees Celsius is equal to $fahrenheit degrees Fahrenheit")
  }
}

