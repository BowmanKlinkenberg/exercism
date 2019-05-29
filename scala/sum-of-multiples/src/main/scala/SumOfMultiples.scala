object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    val multiples: Array[Int] = for ( i <- 1 until limit if  ){
      for (f <- factors ){
        if()
      }
    }
  }

  def isAnyDiv(factors: Set[Int], i: Int): Boolean = {
    // return true if i is divisible by any of the factors
    for (f <- factors){
      if(f % i == 0) true else false
    }
  }

}

