package com.scala.primer;

object HOF {



  def fibanacci(x:Int):Int = {
//    x match {
//      case
//    }
    ???
  }


  def factorial(x:Int):Int = {
    if (x ==0 ) 1 else x * factorial(x-1)
  }

  def findtheindex[a](l:Array[a],p:a => Boolean):Int = {
//    if(m:Int >= l.length)
    def loop(n:Int):Int={
      if (n >= l.length) -1
      else if (p(l(n))) n
      else loop(n+1)
    }

    loop(0)
  }

  def comparision(a:Array[Int],p:(Int,Int) => Boolean ) = {
    def loop(n:Int):Boolean = {
      if(n == a.length-1) true
      else if (p(a(n),a(n+1))) {println(n);loop(n+1)}
      else false

    }

    loop(0)
  }


  def main(args: Array[String]): Unit = {
//    println( factorial(5))

//    println(findtheindex(Array(1,2,3,4,5,6,75,5,7,9),(x:Int) => if (x ==9) true else false))
    println(comparision(Array(1,2,3,4,5,10,9),(x:Int, y:Int) => x < y ))

    println(Array(1,2,3,4,5,10,9).length)

  }

}
