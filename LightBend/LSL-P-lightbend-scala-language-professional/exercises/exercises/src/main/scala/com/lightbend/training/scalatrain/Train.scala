package com.lightbend.training.scalatrain

/*
 * Copyright © 2012 - 2016 Lightbend, Inc. All rights reserved.
 */
import scala.collection.immutable.Seq
case class Station(name:String)
case class Train(info:TrainInfo,schedule:Seq[(Time,Station)]){
  require(schedule.take(2).size ==2,"schedule must contain atleast 2 stations")
  val stations:Seq[Station] = schedule.map(t => t._2)
  def timeAt(station:Station) :Option[Time]=  {
  schedule.find {
    case(_,needle) => needle == station
  }.map{
    case (time,_) => time
  }
  }
}


sealed abstract class  TrainInfo{
def number:Int
}


case class InterCityExpress(number:Int, hasWifi:Boolean = false) extends TrainInfo
case class RegionalExpress(number:Int) extends TrainInfo
case class BavarianRegional(number:Int) extends TrainInfo