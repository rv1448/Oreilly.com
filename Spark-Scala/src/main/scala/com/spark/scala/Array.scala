package com.spark.scala

object array {
  def apply2(i:Int) : String = s"this is2 the value: $i"
  def apply(i:Int) : Int = i

  def main(args: Array[String]): Unit = {


//    val arr = Array("test","dummy","kun");
//
//    val a = arr(0)
//
//    println(s"This is a $a")
//    println(s"This is a ${arr(1)}")
//    array(3)
    val arr = Array("hello","world")
    val arr2 = Array(5)
    arr(1) = "trdt"
    var list = List(1,"3")

  println(s"calling appy(4) ${array.apply(4)}")
//    println(s"calling appy(42) ${array(4)}")
    val i:Int = array(4)
    println(i)
  }

}
