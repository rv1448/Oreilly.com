package com.spark.scala

/**
  * FIRST CLASS FUNCTIONS:
  * METHOD: it is a way defining behaviour of class
  * Methods are defined with Objects and class
  * def nameofufnction(List of parameters):Int = {
  * }
  *
  * FUNCTIONS or FUNCTION LITERAL vlaues that represent functions
  * (x:Int) => x+1
  *
  * Function literal is object
  * Function trait
  *
  * Function objects are like string objects
  * store a function in a variable, like you can store a object in a variable
  *Method return a function,
  * method can take in function
  *
  * Function named are re-usable blocks
  * Mehods all same but in the
  *
  */

object FirstclassFunctions {
  def areaMethod(l:Int, b:Int):Double = {
    val pi = 3.14
    pi * l * b
  }


  val areaFunction = (lf:Int, bf:Int) =>  {
    val pi = 3.14
    pi * lf * bf
  }:Double
  def main(args: Array[String]): Unit = {

    println(areaFunction(2,3))
    println(areaMethod(3,4))

  }


  /***
    * Difference between FUnction and Methods
    *
    * Functions are value types and can be stored in var or Val storage Units. FUnctions are objects - Anyref
    * Methods are not value types - Can not serve as r-values - defined using def
    *
    */




}
