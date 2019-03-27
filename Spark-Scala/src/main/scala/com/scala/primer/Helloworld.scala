package com.scala.primer;

object Helloworld {
  def noargs(a:Unit):Int  = {
    println("no args")
    return 99
  }


  def #~!(a: Int):Int ={
    return 9
  }

// liternal value of unit is ()
  // Difference Between Function and scala
//  http://jim-mcbeath.blogspot.com/2009/05/scala-functions-vs-methods.html
 def main(args: Array[String]): Unit = {
  println("Hello World")
//   println(/*noargs()*/)
    val any: Any = Helloworld
    println(any)

    println(#~!(6));

//    var k = if(math.random > 0.5){
//      1
//    }
//    else 2
//    println(k)

    var k = if(math.random > 0.5) 1 else 2;

    println(k)
 }


}
