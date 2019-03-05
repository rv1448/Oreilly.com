package com.scala.primer

object lambdaExpression {
val square = (x:Double) =>  x*2
val square1:Double => Double = x => x*2
  val lt:(Double,Double) => Boolean = (x,y) => x<y
val lt1 :(Double,Double) => Boolean =  _<_

  def main(args: Array[String]): Unit = {

  }

}
