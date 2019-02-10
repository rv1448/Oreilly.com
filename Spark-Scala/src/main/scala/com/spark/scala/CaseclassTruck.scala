package com.spark.scala

import scala.annotation.tailrec

case class Truck(payload:Int, Fuel:Int)
case class Car(seats:Int, fuel:Int)
object CaseclassTruck {

  def payloadcapacity(v:Any)=v match {
    case Truck(s,_) => s
    case Car(s,_) => 170 *(s-1)
  }
@tailrec
  def capatable(vechi:List[Any], payload:Int):Any= vechi match {
    case Nil => null
    case h::t  if payloadcapacity(h) > payload => h
    case    _::t => capatable(t,payload)
  }


  def main(args: Array[String]): Unit = {
    val t1 = Truck(5000,10)
    val t2:Any=Car(10,2)
    println(t1)

    t2 match {
      case Truck(_,f) if f > 5 => println(s"I found a truck $f with $f fuel")
      case Truck(p,_) => println(s"I found a truck  with $p fuel")
      case Car(k,l) => println(s"$k")
    }

    val fleet = List(Truck(600,5),Car(5,7))
    println(capatable(fleet,300))
    println(capatable(fleet,610))
  }

}
