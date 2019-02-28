package com.spark.scala
//
//object PartialFUnctions {
//  val f1 = PartialFunction[Any,String] = {case s:String => "yes"}
//  val f3 = PartialFunction[Any,String] = {case s:Double => "yes"}
//
////  val pf = f1.orElse(f3)
//
//
//  def main(args: Array[String]): Unit = {
//
//  }
//
//
//}

case class point(x:Double = 0.0, y:Double = 0.0){
  def shift(deltax:Double,deltay:Double) = {
    copy(x+deltax, y+deltay)
  }



















}
