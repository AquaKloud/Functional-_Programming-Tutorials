object Q1{

def main(args:Array[String]): Unit = {

  Area_Of_Disk(5.2)
}
  def Area_of_Disk(radius:Double): Unit = {

    val Area=radius*radius*22/7
    println(s"Area of the disk is = $Area")
  }
  
}
