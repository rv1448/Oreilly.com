package com.spark.scala

object BynameParameters {


  def pres(name:String):String = {
    println("Meet the pres")
    println(s"$name")
    name
  }

  def pres1(name:String):String = {
    println("Meet the pres")
    println(s"$name")
    name
  }

  def votefortrump(s:String):String={
    println("GO d-j-T")
    s
  }

  def votefortrump1(s:String):String={
    println("GO d-j-T")
    s
  }

  def main(args: Array[String]): Unit = {
    println(pres(votefortrump("vittal")))
  }
}
