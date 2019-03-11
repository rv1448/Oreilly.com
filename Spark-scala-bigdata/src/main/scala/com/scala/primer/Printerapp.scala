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

  val printcolor :(Int) => Unit =(x:Int) => println(s"printing color page with $x")
//  val printb/w =(x:Int)=> println(s"printing b/w page with $x")

//val printcolor = (x:Int)=> println(s"printing color page with $x")
  def printerfunc(doc:Document,lastindex:Int, print:(Int) => Unit) = {
    for(i <- 1 to lastindex if(lastindex < doc.Totalpages)) {print(i)}
  }

  def main(args: Array[String]): Unit = {
//    printrange( 1, 10, Document(1,20))
//    printparticularpages(Document(1,30),31,24,12,11,24,11)
    printerfunc(Document(1,20),10,printcolor)
  }

}


case class Document(id:Int,Totalpages:Int)