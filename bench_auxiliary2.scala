
object Bench {
  def main(args: Array[String]) {
    for (i <- 0 until args(0).toInt) {
      def a {
        def b: String = "hoge"
        b
      }
      a
    }
  }
}
