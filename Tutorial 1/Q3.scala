object CalculateSphereVolume {
  def main(args: Array[String]): Unit = {
    // Define the radius
    val radius = 5.0

    // Calculate the volume
    val volume = (4.0/3.0) * math.Pi * math.pow(radius, 3)

    // Print the result
    println(s"The volume of a sphere with radius $radius is $volume")
  }
}

