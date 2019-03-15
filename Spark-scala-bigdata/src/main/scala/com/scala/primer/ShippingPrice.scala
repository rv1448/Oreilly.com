package com.scala.primer

object ShippingPrice {

  val valuemark: PartialFunction[Item,Boolean] = {
    case item => item.price > 500.0
  }

  val isprime:PartialFunction[Item,Boolean] = {
    case item => item.primeEligible
  }


  val freedeliverable = valuemark orElse isprime


  def deliverycharge(item:Item):Int = {
    if(freedeliverable(item)) 0 else 50
  }

  def main(args: Array[String]): Unit = {
    println(deliverycharge(Item("Abc",490.0,true)))
  }


}


case class Item(name:String, price:Double,primeEligible:Boolean)
