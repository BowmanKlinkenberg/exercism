class School {
  type DB = collection.mutable.Map[Int, Seq[String]]

  private val _db: DB = collection.mutable.Map()

  def db: DB = _db

  def add(name: String, g: Int): Unit = _db.get(g) match {
    case None => _db(g) = Seq(name)
    case _ => _db(g) = grade(g) :+ name
  }

  def grade(g: Int): Seq[String] = _db.get(g) match {
    case None => Seq()
    case _ => _db(g)
  }

  def sorted: Map[Int, Seq[String]] = {
    collection.immutable.TreeMap(_db.toSeq:_*).mapValues(_.sorted)
  }
}
