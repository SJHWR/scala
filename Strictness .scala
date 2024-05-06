object Strictness {
  def main(args: Array[String]): Unit = {
    def lessThanOneHundred(num: Int): Boolean = {
      println(s"$num less than 100?")
      num < 100
    }
    def greaterThanTen(num: Int): Boolean = {
      println(s"$num more than 10?")
      num > 10
    }
    val numbers = List(1, 255, 40, 6, 23)
    val filteredLessThanHundred = numbers.filter(lessThanOneHundred); println("")
    val filteredGreaterThanTen = filteredLessThanHundred.filter(greaterThanTen); println("")
    for (number <- filteredGreaterThanTen) println(s"$number")
  }


}
