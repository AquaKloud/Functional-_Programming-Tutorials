object WholesaleCostCalculator {
  def main(args: Array[String]): Unit = {
    // Define the book parameters
    val coverPrice = 24.95  // Cover price of the book in Rs.
    val discount = 0.40    // 40% discount
    val numberOfCopies = 60

    // Calculate the discount price
    val discountPrice = coverPrice * (1.0 - discount)

    // Calculate the shipping cost
    val baseShippingCost = 3.0
    val additionalCopyCost = 0.75
    val shippingCost =
      if (numberOfCopies <= 50)
        baseShippingCost
      else
        baseShippingCost + additionalCopyCost * (numberOfCopies - 50)

    // Calculate the total wholesale cost
    val totalWholesaleCost = discountPrice * numberOfCopies + shippingCost

    // Print the result
    println(s"The total wholesale cost for $numberOfCopies copies is Rs. $totalWholesaleCost")
  }
}

