package sieve

import scala.annotation.tailrec

object Sieve{
    def primes(limit: Int): List[Int] = {
      if (limit < 2) List()
        @tailrec
        def primesAccum(unfiltered: List[Int], knownPrimes: List[Int]): List[Int] = {
            if (unfiltered.isEmpty) knownPrimes.reverse
            else {
                val newPrime = unfiltered.head
                println(newPrime)
                println(unfiltered)
                println(knownPrimes)
                primesAccum(unfiltered.drop(1)filter(_ % newPrime == 0), newPrime :: knownPrimes)
            }
        }
        val startRange = (2 to limit).toList
        primesAccum(startRange, List())
    }
}
