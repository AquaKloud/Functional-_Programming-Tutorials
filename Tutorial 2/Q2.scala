object Q_2 {

  def main(args: Array[String]): Unit = {
    var a=2
    var b=3
    var c=4
    var d=5
    var k=4.3f
    var g=10

    println("--b*a + c*d-- = " +((b-1)*a + c*d))
    println("a++ = " +(a))
    println("-2*(g-k) + c = " +(-2 *(g-k) + c))
    println("c = c++ = " +(c))
    println("c = ++c*a++ = "+((c+1+1)*(a+1)))

  }

}