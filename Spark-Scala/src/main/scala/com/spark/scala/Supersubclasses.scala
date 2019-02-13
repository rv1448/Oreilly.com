package com.spark.scala
import java.util.UUID

class Item {
  val id = UUID.randomUUID();

}

class ElectronicItem(val name:String, val Subcategory:String) extends Item {
  val UUID = "elec"+id
}

/** since Electronic Item inherited from ITEM
  * Every Electronic Item is an Item
  * Thats the reason why we are able to refer to ID and UUID
  */

object Cart {
  def main(args: Array[String]): Unit = {
    def showitem(item:ElectronicItem) = println(s"item id : ${item.id} and Name: ${item.UUID} and item: ${item.name}")

    showitem(new ElectronicItem("Xperia","Mobiles"))
    showitem(new ElectronicItem("Iphone","Mobiles"))

    /**
      * AnyRef
      * The AnyRef class represents all user defined objects, Functions, collections
      *
      * AnyVal
      *
      *
      * Unit:
      * Scala Unit is a subtype of Anyval, and the implementation contains the equals method, which returns a true value
      *
      * Null and Nothing
      * These are called bottom Types in  scala
      */

    def checkfor10(x:Int):Int = {
    if (x == 10)
      x *2
    else
      throw new Exception("Sorry, The value wasn't 10")
    }
    val k = checkfor10(20)
    println(k)

    /**
      * OPERATORS:
      * infix operators
      * prefix operators
      * postfix operators
      * val x = 1 + 10 : here 1 is of Type Int and int has the method + defined in it
      * so instead of 1.+(10) we can use 1 + 10v
      * 1 + 'a'; THis means + methods is over loaded
      *
      */
  }
}
