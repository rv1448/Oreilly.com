package com.pluralsight

object FileTrait extends App{
  import java.io.File

  import scala.io.Source
  trait  Fileops{
    self: File =>
  def istextfile:Boolean = this.getName.endsWith(".txt")
    def readtext:Iterator[String] = {
      Source.fromFile(this).getLines();
    }
    def printlines:Unit = {
      this.readtext foreach println
    }
  }
  import java.io.File;
  val file = new File("/Users/RahulReddy/Desktop/Oreilly_Training/Oreilly.com/ScalaSandbox/area.txt") with Fileops;


  file.printlines

}
