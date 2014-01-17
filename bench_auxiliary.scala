
object Bench {
  def b: String = {
    "hoge"
  }

  def main(args: Array[String]) {
    for (i <- 1 to args(0).toInt) {
      def a {

        b
      }

      a
    }
  }
}
