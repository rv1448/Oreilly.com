package com.scala.primer;

object Textfile {
  def main(args: Array[String]) = {
     val s = Source.fromFile("/Users/RahulReddy/Documents/Hadoop/Airlinedata/test.txt")
    // Its a Iterator, consumed as it used
    // and S is an iterator of characters.. we need to convert it into iterator of String

    val lines = s.getLines() // THis will get us the iterator of Strings

    val mat = lines.map(x => x.split(" ")).toArray // Array of strings
//    println(mat.sum)


    val pw = new PrintWriter("/Users/RahulReddy/Documents/Hadoop/Airlinedata/trow.txt")
  mat.foreach(x => { for (i <- x) println(i)})


//    val k = for (line <- Source.fromFile("/Users/RahulReddy/Documents/Hadoop/Airlinedata/test.txt").getLines) {
//
//      line.map(x=> x.sp)
//    }
//    println(k)


  }
}
