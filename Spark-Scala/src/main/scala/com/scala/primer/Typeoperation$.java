package com.scala.primer;

/**
  * asInstanceof
  * isInstanceof
  ** to<type>
  *   getclass
  */

object Typeoperation {

  def main(args: Array[String]): Unit = {
    123.asInstanceOf[Long]
    println(123.toLong)
    123.toChar
    123.toString()
    213.toDouble
  }

}
