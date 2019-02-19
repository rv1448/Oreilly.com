package com.spark.scala

/**
  * val in the class statement will create final variables. Once initiated to create an object they cannot be appended
  * If we remove both var and val as part of class constructor
  * The scope will be limited; It wont be possible to use it outside the class
  * The compiler will not let you access members of the instance
  * case class with arguements by default means it takes them Immutable parameters
  * Difference between traits and abstract classes
  *   abstract classes you can give cons params
  *   Traits you cannot give constructor params
  *
  * STATIC class or STATIC Member(variable)
  * For those that have only one instance, that particular member will be the same for all the instances
  *
  * @param name
  * @param capital
  */

class Country( val name:String, val capital:String){
  var populationMap = scala.collection.mutable.Map[String,Double]()

  /**
    * THIS METHOD IS SPECIFIC TO THE INSTANCE OF OUR CLASS
    * VAL MAP -> THIS WILL GIVE US POPULATION FOR THE YEAR
    * @param year
    * @return
    */
  def getPopulation( year:String):Double = {
    populationMap(year)
  }

  override def toString: String = s"Country($name,$capital)"


}

object Country{
  def populationaverage(pops:Seq[Double]) = {
    pops.sum/pops.length
  }
}


//abstract class Person(category:String){
//  val idprefix:String
//}
//class Customer extends Person("External"){
//  override val idprefix: String = "CUST"
//}
//class Employee extends Person("Internal"){
//  override val idprefix: String = "EMP"
//}



object cls {
  def main(args: Array[String]): Unit = {
    val coun1 = new Country("France","paris")
    coun1.populationMap += ("2015"-> 64.47)+= ("2014"-> 63.47)+= ("2013"-> 61.47)

    println(s"COuntry name ${coun1.name} and ${coun1.capital}")
    println(coun1)

  }
}

//
//object Collections {
//  /**
//    * Abstraction: abstraction is basically hiding the concrete or internal processing of the task
//    * Encapsulating: grouping meaning full peace of code as a Unit
//    * Inheritance:
//    */
//
//}
