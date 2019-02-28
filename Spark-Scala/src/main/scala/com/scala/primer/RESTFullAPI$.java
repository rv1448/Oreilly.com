package com.scala.primer;

object RESTFullAPI {

  /***
    * ("GET","/user/:id")
    * ("GET","/user/:id/profile/:id")
    * ("POST","/user")
    * ("POST","/profile")
    * ("PUT","/user/:id")
    */
  val k = List(  ("GET","/user/:id")
    ,("GET","/user/:id/profile/:id")
    , ("POST","/user")
    , ("POST","/profile")
    , ("PUT","/user/:id"))
//val m:Map = ();

  def main(args: Array[String]): Unit = {
//   println(k)
    val group = k.groupBy(_._1)
    println(group)
//    k.foreach(_ => println(_))
  }

}
