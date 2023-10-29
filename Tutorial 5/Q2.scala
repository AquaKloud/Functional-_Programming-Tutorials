object Q2{
  def main(args: Array[String]): Unit = {
    print("Enter your number - ")
    val number = scala.io.StdIn.readInt()

    print(s"All prime numbers which less than ${number} - ")
    primeSequence(number)
  }

  def primeSequence(number: Int): Unit = {
    def isPrime(k: Int, i: Int): Boolean = {
      if (i <= 1) true
      else if (k % i == 0) false
      else isPrime(k, i - 1)
    }

    if (number > 2){
      primeSequence(number - 1)
    }

    if (isPrime(number, Math.sqrt(number).toInt)){
      print(number +" ")
    }
  }
}
