object Q_4 {
  def main(args: Array[String]): Unit = {

    var normal = profit(15, 120)
    var increment = profit(20, 100)
    var decrement = profit(10, 140)

    if(normal > increment){
      if(normal > decrement){
        println("Highest profit = " +normal)
        println("Ticket price which can make the highest profit = 15")
      }
      else{
        println("Highest profit = " +decrement)
        println("Ticket price which can make the highest profit = 10")
      }
    }
    else{
      if (increment > decrement) {
        println("Highest profit = " + increment)
        println("Ticket price which can make the highest profit = 20")
      }
      else {
        println("Highest profit = " + decrement)
        println("Ticket price which can make the highest profit = 10")
      }
    }

  }

  def profit(price: Int, No_of_Tickets: Int): Int = income(price, No_of_Tickets) - cost(No_of_Tickets)

  def income(price: Int, No_of_Tickets: Int): Int = {
    price * No_of_Tickets
  }

  def cost(No_of_Tickets: Int): Int = {
    No_of_Tickets * 3 + 500
  }

}
