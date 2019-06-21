import scala.math._

object Darts {
  def score(x: Double, y: Double): Int = {
    val rad: Double = sqrt(pow(x, 2) + pow(y, 2))
    if (rad <= 1 ) 10
    else if (rad <=5) 5
    else if (rad <=10) 1
    else 0
  }
}

