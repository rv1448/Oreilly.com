package com.spark.scala

object CallvalCallname {

  /**
    * Call by name: is an evaluation strategy where we substitute the literal ath the place from where we
    * call our function.
    */

  val printswitch = false
  val colourprint = (index:Int) => println(s"This is a colour print of index $index")
  val BWprint = (index:Int) => println(s"This is a BW print of index $index")

  def printpage(doc:xocument, index:Int, print:(Int) => Unit, isprinteron: => Boolean) = {
    if(index <= doc.lastindex && isprinteron) for (i<- 1 to index) print(i)
  }

  def main(args: Array[String]): Unit = {

    printpage(xocument(10,"doc"),8 , colourprint, !printswitch)
    printpage(xocument(8,"doc"),8 , BWprint,  !printswitch)

    /**
      * Step1 : defined a new function in isprinteron takes no input () => but outputs boolean
      * printpage(xocument(10,"doc"),8 , colourprint,() => !printswitch)
      *
      *
      */
  }

}

case class xocument(lastindex:Int, Typeofdocumet:String)
