package com.scala.test
/*
? what is an companion object
 */
class Animal {
  var animalName:String = "notset"
  def setanimalName(name:String): Unit ={
    animalName = name
  }

  def getanimalName:String= {
  animalName
  }

  def isAnimal:Boolean={
    if(getanimalName == "notset") false else true
  }
}

object Animal{
  def main(args: Array[String]): Unit = {
    val obj:Animal = new Animal
    var flag:Boolean = false

    obj.setanimalName("dog")
    flag = obj.isAnimal
    println(flag)

    obj.setanimalName("notset")
    flag = obj.isAnimal
    println(flag)
  }
}
