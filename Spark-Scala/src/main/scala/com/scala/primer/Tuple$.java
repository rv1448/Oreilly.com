package com.scala.primer;

object Tuple {



  def dividor(num1:Int, dem1:Int):Option[Int] = {
    if (dem1 == 0) None else Option(num1/dem1)
  }


  val personalinfo = ("rahul","vangala","m","1970")
  val K = List("rahul","vangala","male","1970")
  def main(args: Array[String]): Unit = {

//    println(personalinfo.foreach(println()))

//    personalinfo.productIterator.foreach(println(_))
//    K.filter(x => match {case x(2) => true
//    case _ => false})

//  K.foreach(println(x => x.charAt(2)))

//    val k = 1::2::3::4::Nil
//    println(k)
//    println(1 to 10 )


    // foreach takes a procedure... applies to every element
    // Foreach os a statement
    // cannot chain foreach
    //
//val b = for(i <- K) yield {
//if (i.charAt(1) == 'a') i
////  println(i(1)) else "b"
//}
//    println(b.filter(_!=()))

//K.foreach(x => println(
//  {if(x.charAt(1) == 'a') x != ()}   ))
//

    println(K.map(_ == "rahul"))

   val a = List(10,20,30,40,50,60)

//    println(a.scanRight(0)(_-_))
//    println(a.scanLeft(0)(_-_))
//    println(a.scan(0)(_-_))


    println(a.reduceRight(_-_))
    println(a.reduceLeft(_-_))
    println(a.reduce(_-_))


    val map = Map(("california","CA"),("Newyork","NY"),("NewJersey","NJ") )
    map.foreach((p:(String,String)) => println(p._1) )
    map.foreach(x => println(x._1))

    val num = List(1,2,3)
    val numstr = List("1","2","3")

    val comb =  num zip numstr
    println(comb)

    comb.foreach(x => println(x._1))




  }

}
