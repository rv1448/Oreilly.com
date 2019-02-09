package com.spark.scala

object TryMatches {

  def main(args: Array[String]): Unit = {

    var seven = 1|2|3|4
    val x:Any = 6
//    println(seven)
    val y = x match  {
      case k:Int if k < 5  => println(s"This is  $k")
//      case _ => println("this is no val"); 7
      case 1|2|3|4 => println("Its one of these")
        //Pattern -- Not an expression
      case 5 => println("This is  4")
      case _ => println("this is no val"); 7

    }

//    println(y)


    val k = "hello"
    val h = "hello"
    println(k.equals(h)) // equals perform the string comparision
    // String is of type anyref and
    // for other equal it is what  equal method in the class would return

  }

}
