object Interest extends App{

  def interest(p:Double,i:Double,r:Double):Double = p*i*r

  val int1 = interest(100,200,1.2)
  println(s"the rate of the interest ${int1}")

  val increment = (x:Int) => x + 1;
  println(increment(10))

}
