package com.lightbend.training.scalatrain

case class Time( hours:Int=0,  minutes:Int=0)  extends Ordered[Time]{

  require(hours >=0 && hours <24,"Invalid Hour")
  require(minutes >=0 && minutes < 60,"Invalid Minute")

  val asMinutes:Int = hours * 60 +minutes;

   def minus(that:Time):Int = {
      asMinutes - that.asMinutes
   }

  def -(that:Time):Int = minus(that)

  override lazy val toString:String = f"$hours%02d:$minutes:%02d"

  override def compare(that: Time): Int = asMinutes - that.asMinutes

}


object Time {

  def fromMinutes(m:Int):Time = {
    val hours = m/60
    val minutes = m%60

     Time(hours,minutes)
  }

}
