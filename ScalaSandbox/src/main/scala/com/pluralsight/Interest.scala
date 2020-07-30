package com.pluralsight

object Interest extends App{

  def interest(p:Double,i:Double,r:Double):Double = p*i*r

  val int1 = interest(100,200,1.2)
  println(s"the rate of the interest ${int1}")

  val increment = (x:Int) => x + 1;
  println(increment(10))

  val simpleinterest = (p:Double,i:Double,r:Double) => {p * i * r}:Double
  val compountinterest = (p:Double,i:Double,r:Double) => (p * (Math.pow((1+r),r))) - p

  def interestReport(p:Double,i:Double,r:Double,calc:(Double,Double,Double) => Double):Double = {
    calc(p,i,r)
  }


  def convertStringtoInt(x:String):Option[Int] = {
    try {
      Some(x.toInt)
    }
    catch   {
      case num: NumberFormatException => None
    }
  }


  def convertStringToIntEither(x:String):Either[String,Int] = {
    try{
      Right(x.toInt)
    }
    catch {
      case e : Throwable => Left(s"${e.getMessage}")
    }
  }




  val print = convertStringtoInt("ab").getOrElse(0)

  convertStringtoInt("145") match {
    case Some(x) => println(s"SUccessfully casted into Integer${x}")
    case _ => println("exception")
  }

  convertStringtoInt("abc").map(x => x*2).map(println)
  convertStringToIntEither("01").map(number => println(number))
}
