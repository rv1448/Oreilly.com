package com.scala.primer;

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
  * Methods are associated with class
  *
  *
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

  def getarea(r:Double) = {
    3.14 * r * r
  }

  val y : (Double) => Double = getarea  /* This is for converting a method to a function */
  val p : (Double) => Double = getarea

  val m = getarea _ /* THis is for converting method to a afunction using a ETA operator */

  val PI = 3.14

  def pie():Double = PI

  val piefunc:() => Double = pie

  /***
    * Difference between FUnction and Methods
    *
    * Functions are value types and can be stored in var or Val storage Units. FUnctions are objects - Anyref
    * Methods are not value types - Can not serve as r-values - defined using def
    *
    */




}
