package com.scala.primer;

/**
  * In scala all values are from classes
  * Any
  * Anyval Anyref
  * Nothing is common for anyva; and any ref
  * Null for anyref
  * Anyval only accepts value type and AnyRef only takes reference types
  * Any takes both
  *
  * EMPTINESS
  * null Null Nothing Nil None Unit
  * null: same as null in java
  * value types cannot be null
  * this can be handled with option collection
  *
  * Null: type interface
  *
  * Nil: special value to associated to List
  *
  * None: option collection
  *
  * Unit: is same as void in java.
  */
object Typesystem {

  def printany(x:Any) = println(x)
  def printanyval(x:AnyVal) = println(x)
  def printanyref(x:AnyRef):Unit =  println(x)
  def fraction(num:Double, dem:Double):Option[Double] = {
    if (dem !=0) Some(num/dem) else None
  }

  def main(args: Array[String]): Unit = {
     val a = 5
    val b = new Object

    printany(a)
    printany(b)
//    printanyref(a)

    val k = fraction(1,5)
    val g = fraction(1,0)
    println(s"$k $g")

  }

}
