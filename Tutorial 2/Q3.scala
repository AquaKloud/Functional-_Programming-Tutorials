object Q_3 {
    def main(args: Array[String]): Unit = {
        def wage(Working_Hours: Int): Int = Working_Hours * 250

        def ot(Ot_Hours: Int): Int = Ot_Hours * 85

        def income(Working_Hours: Int, Ot_Hours: Int): Int = wage(Working_Hours) + ot(Ot_Hours)

        def tax(income: Int): Double = income * 0.12

        def take_Home(Working_Hours: Int, Ot_Hours: Int): Double = income(Working_Hours, Ot_Hours) - tax(income(Working_Hours, Ot_Hours))

        println("Take home salary of the employee = "+(take_Home(40, 30)))

    }
}