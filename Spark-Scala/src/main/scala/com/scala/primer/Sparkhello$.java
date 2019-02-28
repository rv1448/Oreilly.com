package com.scala.primer;

object Sparkhello {
  def main(args: Array[String]) = {
    Logger.getLogger("org").setLevel(Level.ERROR)

//    val sc = new SparkContext()
//    val config = new SparkConf().setAppName("Wordcount")

    val sparkConf = new SparkConf().setAppName("SOME APP NAME").setMaster("local[2]").set("spark.executor.memory", "1g")
    val sc = new SparkContext(sparkConf)
    val pairRdd1 = sc.parallelize(List(("a", 1), ("b",2), ("c",3)))
    pairRdd1.foreach(println(_))
  }
}
