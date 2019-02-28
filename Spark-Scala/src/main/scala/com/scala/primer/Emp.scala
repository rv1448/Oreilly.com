package com.spark.scala

class Emp(val name:String, val id:Int) {



  def printname:Unit = {

    println(name)
  }


}


object k {
  def main (args: Array[String] ): Unit = {
    val k = new Emp("rahul",10)
    k.printname
}
}