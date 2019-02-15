package com.spark.scala

import scala.xml.Document

object Functiontest {
//  def printpage



  def main(args: Array[String]): Unit = {
    printpages(document(10,"doc"),2 , colorpages)
    printpages(document(10,"doc"),5 , Bwpages)

    /*
    scala uses function literals in default constructs.
     */
    println(names.filter( _.startsWith("a")))

  }

    /** print pages takes a function literal.
      * the function literal represents our print function form
      * @param doc
      * @param lastindex
      * @param print this is the function literal
      */
    def printpages(doc:document,lastindex:Int, print:(Int) => Unit ) = {
      if(lastindex <= doc.numofpages) for(i <- 1 to lastindex)print(i)

    }

  /**
    *
    */
  val names = List("alice","mark","cuban")
  /**
    *
    */
  val colorpages =(index:Int) => println(s"the colorpages document is $index")
    val Bwpages =(index:Int) => println(s"the bwpages document is $index")

}

case class document(numofpages:Int, typeofdoc:String)
