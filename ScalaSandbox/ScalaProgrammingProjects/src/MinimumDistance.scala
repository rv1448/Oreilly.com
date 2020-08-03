class MinimumDistance {



  def arrayImpl(points:Array[(Int,Int)], min:Int):Seq[Double] = {
    for(i <- 0 until points.length;
        j <- i until points.length
        if i!=j
        if distance(points(i),points(j)) > min)  yield   distance(points(i),points(j))
  }


  def distance(p1:(Int, Int), p2:(Int, Int)):Double = {
    val (x1,y1) = p1;
    val(x2,y2) = p2;
    Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2))
  }

}

object MinimumDistance {

  def main(args:Array[String]) = {
    val holder: Seq[Double] = new MinimumDistance().arrayImpl(Array((10,10),(20,20),(30,30),(40,40)),15)
    println(holder)
  }
}