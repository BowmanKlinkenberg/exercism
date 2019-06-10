object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    val multiples: Seq[Int] = for {
      i <- List.range(factors.min, limit)
      f <- factors
      if (i % f == 0)
    } yield i

    // zero must be appended in case the set was empty, to guarantee that reduce returns an Int
    val unique: Set[Int] = multiples.toSet + 0
    unique.reduce(_ + _)
  }
}
