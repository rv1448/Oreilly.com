class Shape(val x:Int, val y:Int){
  val isAtOrigin:Boolean = x ==0 & y==0
  //def isAtOrigin():Boolean = x ==0 & y==0
}

class Rectange(  x:Int,   y:Int,len:Int,wid:Int) extends Shape(x,y);



trait Description {
  def description:String
}

class Coordinates(val x:Int, val y:Int) extends Description{
  override def description:String = {
    s"(x: ${x} , y: ${y})"
  }
}

trait Area{
  def area:Double
}

val coord1 = new Coordinates(1,2)
println(coord1.description)
val coord2 = new Coordinates(3,4)
println(coord2.description)