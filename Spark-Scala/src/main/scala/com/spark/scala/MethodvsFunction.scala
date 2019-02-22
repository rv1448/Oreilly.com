package com.spark.scala

object MethodvsFunction {



  def area(l:Int, b:Int):Double = {
    3.14 * l * b
  }


  def squareperimeter(side:Int):Int = {
    4 * side
  }
 
  val areafunc = (lf:Int, bf:Int) => {
    3.14 * lf * bf
  }:Double



  /**
    * only function not method
    * @param args
    */

  def main(args: Array[String]): Unit = {


    println( area(3,4))
  }

}
