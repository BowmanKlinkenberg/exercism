case class Counter(count: Int = 0) {
  def dec = copy(count - 1)
  def inc = copy(count + 1)
}

val count = new Counter
count.dec.dec
