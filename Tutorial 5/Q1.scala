object Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter your number - ")
    val number = scala.io.StdIn.readInt()
    val divisor = Math.sqrt(number).toInt

    println(number +" is a prime number - " +isPrime(number, divisor))
  }

  def isPrime(number: Int, divisor: Int): Boolean = {
    if (divisor == 1){
      true
    }
    else {
      if (number % divisor == 0){
        false
      }
      else{
        isPrime(number, divisor - 1)
      }
    }
  }
}
