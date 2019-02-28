package com.spark.scala

class AppTrait  {

  def main(args: Array[String]): Unit = {
    val double:(Int => Int) = _ * 2
    (1 to 10).foreach(double.andThen(println(_)))

  }
}
