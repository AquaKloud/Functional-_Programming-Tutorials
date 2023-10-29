object Q3 {
  def main(args: Array[String]): Unit = {
    print("Enter your number - ")
    val number = scala.io.StdIn.readInt()

    println(s"Addition of numbers from 1 to ${number} - " +sum(number))
  }

  def sum(number: Int): Int = {
    if (number == 1){
      1
    }
    else{
      number + sum(number - 1)
    }
  }
}
