object Main {
  def main(args: Array[String]): Unit = {
    def lessThan100(i: Int): Boolean = {
      println(s"$i less than 100?")
      i < 100
    }
    def moreThan10(i: Int): Boolean = {
      println(s"$i more than 10？")
      i > 10
    }
    val a = List(1, 255, 40, 6, 23)
    val q0 = a.filter(lessThan100); println("")
    val q1 = q0.filter(moreThan10); println("")
    for (r <- q1) println(s"$r")
  }
}