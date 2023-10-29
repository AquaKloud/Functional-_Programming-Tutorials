object Q5 {
  def main(args: Array[String]): Unit = {
    print("Enter your number - ")
    val number = scala.io.StdIn.readInt()
    print(s"The addition of all even numbers less than given ${number} is " +sum(number))
  }

  def sum(number: Int): Int = {
    if (number == 0){
      0
    }
    else if (number % 2 == 0){
      number + sum(number - 2)
    }
    else{
      sum(number - 1)
    }
  }
}
