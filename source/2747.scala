object Main {
  def main(args: Array[String]): Unit = {
    val n = Integer.parseInt(readLine())
    println(fib(n))
  }

  def fib(n: Int): Int = {
  	def go(count: Int, prev: Int, acc: Int): Int = {
  		if(count==0) 0
  		else if(count==1) acc
  		else go(count-1, acc, prev+acc)
  	}
  	go(n,0,1)
  }
}