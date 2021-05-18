import scala.io.StdIn

object parser{

  def main(args:Array[String]):Unit = {
    StdIn.readLine("Hi give us input to feed and press x to quit")

    var timeToBye = false ;
    while (!timeToBye)
      timeToBye = StdIn.readLine(":")  match {
      case "x" => println("bye"); true
      case _ => println("intresting");false

     }
  }

}