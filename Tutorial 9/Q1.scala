object Q1 {
  def main(args: Array[String]): Unit = {
    var x= new Rational(1,4)
    println("Rational Number : "+x)

    var y = x.neg
    println("Negative Value : " + y)
  }
  class Rational(n:Int, d:Int){
    require(d != 0,"Denominator can not be zero")

    def numerator =n
    def denominator =d

    def neg = new Rational(-this.numerator,this.denominator)
    override def toString():String= numerator + "/" + denominator
  }
}

