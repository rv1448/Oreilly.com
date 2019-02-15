package com.spark.scala

object Loops_cons {
  def main(args: Array[String]): Unit = {
    val list = List("hero1","hero2","hero3","hero4")
    for(li <- 0 to list.length) println(li)

    val person1 = person(1,30,"Male")
    val person2 = person(1,31,"Male")
    val person3 = person(1,32,"Male")

    val persons = List(person1,person2,person3)


  }

  case class person(id:Int,age:Int,gender:String)
}
