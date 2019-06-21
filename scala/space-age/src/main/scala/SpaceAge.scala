object SpaceAge {
  def earthYears(seconds: Double): Double = seconds / 31557600.000
  def earthYears(seconds: Int): Double = seconds.toDouble / 31557600.000
  def onEarth(seconds: Double): Double = earthYears(seconds)
  def onMercury(seconds: Double): Double = earthYears(seconds) / 0.2408467
  def onVenus(seconds: Double): Double = earthYears(seconds) / 0.61519726
  def onMars(seconds: Double): Double = earthYears(seconds) / 1.8808158
  def onJupiter(seconds: Double): Double = earthYears(seconds) / 11.862615
  def onSaturn(seconds: Double): Double = earthYears(seconds) / 29.447498
  def onUranus(seconds: Double): Double = earthYears(seconds) / 84.016846
  def onNeptune(seconds: Double): Double = earthYears(seconds) / 164.79132
}
