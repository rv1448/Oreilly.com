package com.spark.scala

// _ can only be used once
//

object LambdaExpressions {
  val x = (y:Int) => {y*y}

  val y: Int => (Int) = x => {x * x}

  val z: (Int) => Int = _*2

  def main(args: Array[String]): Unit = {
    println(y(2))
    println(z(2))

    val k = for ( i <- 0 until 10; if i%2 == 0; j <- 'a' to 'c' ) yield {
      i -> j
    }

    val m = Array(9,3,4,5,2,3,4,56)
  }


}
