package com.spark.scala

object NestedFunctions {

  def getcirclestats(r:Int):(Double,Double) = {
val pi = 3.14
    def getarea(r:Int):Double={
    pi * r * r
    }

    def getpermeter(r:Int):Double={
    2 * pi * r
    }

    (getarea(r),getpermeter(r))
  }

  def main(args: Array[String]): Unit = {

    println(getcirclestats(5))

  }

}
