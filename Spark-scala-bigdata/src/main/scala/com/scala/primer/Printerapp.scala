package com.scala.primer

object Printerapp {

  def printrange(start: Int, end: Int, doc: Document) = {
    if ( end <= doc.Totalpages & start <= end ) for ( i <- start to end ) {
      println(s"Printing page $i")
    }
  }

  def printparticularpages(doc: Document,pages:Int *) = {
    for(i <- pages)
      if (i <= doc.Totalpages)
        println(s"Printing page $i")
      else println(s"couldn't find page $i")
  }

  def main(args: Array[String]): Unit = {
    printrange( 1, 10, Document(1,20))
    printparticularpages(Document(1,30),31,24,12,11,24,11)
  }

}


case class Document(id:Int,Totalpages:Int)