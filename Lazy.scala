object Lazy {
  def main(args: Array[String]): Unit = {
    def lessThan100(i: Int): Boolean = {
      println(s"\n$i less than 100?")
      i < 100
    }
    def moreThan10(i: Int): Boolean = {
      println(s"$i more than 10?")
      i > 10
    }
    val element = List(1, 255, 40, 6, 23)
    val first = element.withFilter(lessThan100)
    val second = first.withFilter(moreThan10)
    for (r <- second) println(s"$r")
  }
}