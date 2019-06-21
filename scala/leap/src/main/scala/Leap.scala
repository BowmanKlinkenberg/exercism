object Leap {
  def leapYear(year: Int): Boolean =
    isDiv(year) && !isExcept(year)

  private def isDiv(year: Int): Boolean = year % 4 == 0

  private def isExcept(year: Int): Boolean =
    (year % 100 == 0) && !(year % 400 == 0)
}
