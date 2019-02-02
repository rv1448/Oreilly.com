package com.scala.test

// Anything that is declared as an object cannot be initiated
// The basic syntax of an object is as follows
// Singleton object makes sure that there is only one instance of the object

class Classesinscala {
  var animalname:String = "a"
  var animalage:Int = -1

  def setAnimalname(animalname: String)={
    this.animalname = animalname
  }
  def setAnimalage(animalage:Int): Unit ={
    this.animalage = animalage
  }

  def getAnimalname(): String = {
    this.animalname
  }

  def getAnimalage():Int = {
  return this.animalage
  }


}
