package com.spark.scala


case class user(name:String,Age:Int)
object PatternMatching {
  val users  = Map(1 ->  user("joe Rogan",30),2 ->  user("kamala harris",45))

  def main(args: Array[String]): Unit = {
   val(x,y)  = (100,200)
    val k = Map("india" -> "delhi","japan" -> "tokyo") // THis creates a map object

    val h = k.get("india") // get produces some or none depending on whether Map exists

//    val p = show(k.get("ind"))
//    val m = show(k.get("india"))
//    println(p)

    showuser(4) match {
      case Some(user) => println(user)
      case None => println("This user doesn't exist")
    }
  }

  def show(x:Option[String])= x match {
    case Some(s) => println("found the string"); // depending on the return type the return type is set as Any or Unit
    case None => println("Didn't find the string")
//    case @t(x,y) =>
  }

  def showuser(x:Int):Option[user] = users.get(x)




}
