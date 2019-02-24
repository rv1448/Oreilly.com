package com.spark.scala
// Applies to methods and functions
// IN higher order function that takes function as an input
// instead of defining the function that is sent as parameter, we can use the anonymous function
// that acts like logic itself while calling the main function
// Try calling more functions
object Placeholder {

  def ISVIP(first:String, last:String, fn:(String,String) => Boolean):Boolean={
    fn(first,last)
  }

  def checkvip(fnname:String,fnlast:String):Boolean={
    if(fnname=="donald" && fnlast == "trump") true else false
  }

val f:(Int,Int) => Int = (x,y) => x + y
  val f2 = (x:Int,y:Int) => x+y



  def main(args: Array[String]): Unit = {
    print(ISVIP("donald","trup",checkvip))
    print(ISVIP("donald","trup",_ == "donald" && _ == "trump"))

    ISVIP("donald","trup",_ == "donald"  && _ == "trump")
  }

}
