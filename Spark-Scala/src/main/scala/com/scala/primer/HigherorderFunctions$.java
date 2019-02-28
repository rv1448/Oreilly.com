package com.scala.primer;

// Function are named expressions
// expression can be assigned val and variable and passed into functino and returned from function
// Takes a function or retruns a function
// Fcuntions are anyother value aor vairable
object HigherorderFunctions {
// Simple comparator
  def simplecompare(s1:String, s2:String):Int = {
    if (s1 == s2) 0 else if (s1 < s2) -1 else 1
  }
  // Takes function as an input

  def complexcompare(a1:String, a2:String, cmpn:( String ,String) => Int):Int = {
    cmpn(a1,a2)
  }

  // Returns a Function

  def simpledesc(s1:String, s2:String):Int = {
    if (s1 == s2) 0 else if (s1 > s2) -1 else 1
  }

  def complexcomparereturn(b1:Boolean):(String,String) => Int = {
    if (b1 == true)simplecompare
    else simpledesc
  }



  def main(args: Array[String]): Unit = {
  println(simplecompare("abc","bcd"))
    println(complexcompare("abc","bcd",simplecompare))

    val f = complexcomparereturn(false)
    println(f("123","456"))
  }

}
