import scala.util.matching.Regex

object Bob {
  val shoutQuestion: Regex = """[^a-z]*[A-Z]+[^a-z]*\?$""".r
  val shout: Regex = """[^a-z]*[A-Z]+[^a-z?]*$""".r
  val question: Regex = """.*\?$""".r

  def response(statement: String): String = statement.trim match {
    // listed from most specific to least specific
    case shoutQuestion(_*) => "Calm down, I know what I'm doing!"
    case shout(_*) => "Whoa, chill out!"
    case question(_*) => "Sure."
    case "" => "Fine. Be that way!"
    case _ => "Whatever."
  }
}
