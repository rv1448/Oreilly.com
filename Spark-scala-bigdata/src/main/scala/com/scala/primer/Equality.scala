package com.scala.primer

object Equality {

  /* eq is the instance reference
  * equals is the value of the object itself
   */
  /**
    * @param args
    * In scala, Nothing is subtype of everything
    */
  def main(args: Array[String]): Unit = {
    val a = new String("test")
    val b = new String("test")
    println(a eq b)
    println(a equals  b)
    println(a.isInstanceOf[String])
  if10or20(10)
//    println(k)
  }

  def if10or20(num:Int):Int = {
    if(num equals 10){
      print(num *2)
     num*2
    }
    else {
      throw new Exception("Sorry, Value is not 10")
    }
  }

}
