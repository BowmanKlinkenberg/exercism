package sieve

import scala.annotation.tailrec

object Sieve{
  def primes(limit: Int): List[Int] = {
    @tailrec
    def primesAccum(unfiltered: List[Int], knownPrimes: List[Int]): List[Int] = {
      // list is prepended as it's built for efficiency. Need to reverse when it's returned
      // to start with the smallest value
      if (unfiltered.isEmpty) knownPrimes.reverse
      else {
        val newPrime = unfiltered.head
        primesAccum(unfiltered.filter(_ % newPrime != 0), newPrime :: knownPrimes)
      }
    }
    primesAccum((2 to limit).toList, List())
  }
}
