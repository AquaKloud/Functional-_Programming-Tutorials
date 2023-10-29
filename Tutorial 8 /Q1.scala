object Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter the deposit amount: ")
    val depositAmount: Double = scala.io.StdIn.readDouble()

    val interest: Double = calculateInterest(depositAmount)
    println(f"The interest earned : Rs. ${interest}%.2f")
  }

  val calculateInterest: Double => Double = (depositAmount: Double) => {
    if (depositAmount <= 20000) {
      depositAmount * 0.02
    }
    else if (depositAmount <= 200000) {
      depositAmount * 0.04
    }
    else if (depositAmount <= 2000000) {
      depositAmount * 0.035
    }
    else {
      depositAmount * 0.065
    }
  }
}
