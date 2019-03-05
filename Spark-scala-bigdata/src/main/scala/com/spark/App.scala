package com.spark
import org.apache.spark._
import org.apache.spark.sql.{DataFrame, SparkSession}

object App {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("GitHub push counter")
      .master("local[*]")
      .getOrCreate()

    val sc = spark.sparkContext
    sc.setLogLevel("ERROR")
    val ghLog = spark.read.json("/Users/RahulReddy/Documents/Hadoop/Spark/2015-01-01-15.json")
    println(ghLog.count)
    ghLog.collect()
  }

}
