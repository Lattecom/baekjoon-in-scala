object Main2750 {
  import scala.io.StdIn._

  def main(args: Array[String]): Unit = {
    val n = Integer.parseInt(readLine())

    val li = readNLineToList(n, List(): List[Int])

    println(insertSort(li))
  }

  def insertSort[A](la: List[A])(implicit ord: Ordering[A]): List[A] = {
    def insert(la: List[A], a: A) = {
      val (h, t) = la.span(ord.lt(_, a))
      h ::: (a :: t)
    }

    la.foldLeft(List[A]())( (acc, a) => insert(acc, a))
  }

  def readNLineToList(cnt: Int, l: List[Int]): List[Int] = {
    if (cnt==0) return l
    else readNLineToList(cnt-1, l union List(Integer.parseInt(readLine())))
  }
}
