package com.spark

object WeatherAnalysis {

  case class Tempdata(day: Int, doy: Int, month: Int, year: Int, Precip: Double, snow: Double, tave: Double, tmax: Double, tmin: Double)

  def main(args: Array[String]): Unit = {

    def doubleornot(s:String):Double = {
      try{
        s.toDouble
      }
      catch {
        case _:NumberFormatException => -1
      }
    }

    val source = scala.io.Source.fromFile("/Users/RahulReddy/Documents/Hadoop/Spark/MN212142_9392.csv")

    val lines = source.getLines().drop(1)

    val data = lines.flatMap{ line =>
      val p = line.split(",")
      if(p(7) == "." || p(8) == "."|| p(9) == ".") Seq.empty
      else
      Seq(Tempdata(
        p(0).toInt, p(1).toInt, p(2).toInt, p(4).toInt, doubleornot(p(5)),
        doubleornot(p(6)), p(7).toDouble, p(8).toDouble, p(9).toDouble
      ))

    } .toArray

    source.close()
    println(data.length)
    data.take(5).foreach(println)
  }
}
