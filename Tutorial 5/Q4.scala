object Q4 {
  def main(args: Array[String]): Unit = {
    print("Enter your number - ")
    val number = scala.io.StdIn.readInt()
    println(isEven(number))
  }

  def isEven(number: Int): String = {
    if (number == 0){
      "Number is even"
    }
    else if (number == 1){
      "Number is Odd"
    }
    else if (number < 0){
      isEven(-number)
    }
    else{
      isEven(number - 2)
    }
  }

}
