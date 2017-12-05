object Main_1001 {
  import scala.io.StdIn._

  def main(args: Array[String]) {
    val a = readLine().split(" ").map(Integer.parseInt)
    println(a(0)-a(1))
  }
}
