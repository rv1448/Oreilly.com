package com.scala.primer

object ForExpression {
  val k = person(1,"a",1000)::person(2,"b",2000)::person(3,"c",3000)::Nil
  var sum:Double = 0;

  def comparev1(val1:Int = 10, val2:Int):Unit = {
    val result = if(val1 > val2) 1 else if (val1 < val2) -1 else 0
    printresult(val1,val2,result)
  }

  def printresult(v1:Int,v2:Int,result:Int):Unit = result match {
    case 1 => println("v1 is greater then v2" )
    case -1 => println("v2 is greater then v1" )
    case 0 => println("v2 is equal to v2" )
  }


  def main(args: Array[String]): Unit = {
    for(p <- k){
      println(p.salary)
    }

    val salarys = for{
    m <- k
    if(m.salary > 999)
    }  yield  m.salary

    println(salarys)

    comparev1(val2=9)

  }


}



case class person(id:Int,name:String,salary:Double)
