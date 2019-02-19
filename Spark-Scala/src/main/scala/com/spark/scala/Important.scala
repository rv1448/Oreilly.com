package com.spark.scala

object Important {

  /**
    * difference between statement vs Expressions
    * Expressions can be chained and statements cannot be chained
    *
    * STATEMENTS: Units of code that do not return a value
    * EXPRESSIONS: Units of code that return a value
    * Everything in java statement
    * assigning a value and printing to screen
    * Expression can be chained with an expression or function
    * Only expression  can be assigned to something
    *
    * MATCH EXPRESSIONS
    * can Match on TYPE and VALUE and ERROR or NOT
    *
    * 2 Types of iterators
    * Value binding and Numeric Range
    *
    *HIGH ORDER FUNCTIONS
    * foreach map flatmap
    */
val daysinweek = List("mon","tues","wed","thurs","fri","sat","sun")


  def main(args: Array[String]): Unit = {
//    println("12a".asInstanceOf[Long])
//    println("12a".toLong)
//    println(123.getClass)

    /**
      * THis is value binding example
      */
    val listnew = for(day <- daysinweek) yield {
      day match {
        case "mon" => "This is crazy monday"
        case _ => {day}
      }
    }

    println(listnew)





   def g( l:Int,  b:Int):Double = {
//      val l,b = 10;
      3.14 * l * b;
    }


    val m = ( l1:Int,  b1:Int) => {
     println( 2 * l1 * b1 )
    }
    m(1,2)

    val dayofweek = "tuesay"

//    val result = dayofweek match {
//      case a:String => println(s"This is a string $a")
//    }


    def f():Unit= dayofweek match {
//      case a:String => println(s"This is a string $a")
      case "tuesday" => println("This is a string tuesday")
      case something => println(s"this is something $something")
    }

    f()



  }

}
