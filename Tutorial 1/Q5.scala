object RunningTimeCalculator {
  def main(args: Array[String]): Unit = {
    // Define the paces and distances
    val easyPaceDistance1 = 2.0  // 2 km at an easy pace
    val easyPaceTimePerKm = 8.0  // 8 minutes per km
    val tempoPaceDistance = 3.0  // 3 km at tempo pace
    val tempoPaceTimePerKm = 7.0  // 7 minutes per km
    val easyPaceDistance2 = 2.0  // 2 km at an easy pace

    // Calculate the time for each segment
    val timeAtEasyPace1 = easyPaceDistance1 * easyPaceTimePerKm
    val timeAtTempoPace = tempoPaceDistance * tempoPaceTimePerKm
    val timeAtEasyPace2 = easyPaceDistance2 * easyPaceTimePerKm

    // Calculate the total running time
    val totalRunningTime = timeAtEasyPace1 + timeAtTempoPace + timeAtEasyPace2

    // Print the result
    println(s"The total running time is $totalRunningTime minutes")
  }
}

