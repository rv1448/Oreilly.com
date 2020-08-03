val list = for(i <- 1 to 10 if i%2==0) yield i
println(list)



val mp = for{ i <- 1 to 100 if i%3 == 0} yield i


val mp = for(i <- 1 to 100 if i%3 == 0) yield i

 val seasons = Array("Winter","Summer","fall")

seasons.mkString(",")





def distance(p1:(Int,Int),p2:(Int,Int)):Double = {
  val(x1,y1) = p1;
  val (x2,y2) = p2
  Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2))
}
val coor = Array((1,1),(2,2),(3,3),(4,4))
val min = 10;
val distancelist = for(i <- 0 until coor.length; j <- i until coor.length if i!=j; if distance(coor(i), coor(j)) >  min )  yield distance(coor(i), coor(j))
println(distancelist)



val test = for(i <- 0 until 100 if i%2 ==0) yield i
println(test)


val set = Set("ABC","abc")
println(set)
println(set.size)

coor(0) = (1,4);
coor.foreach(println)

val string1:String = "Hello"
val string2:String = string1

if (string1 eq string2) println("same")


val string3:String = "Hello1"
val string4:String = "Hello1"
if (string3 == string4) println("same")

class A(val name:Int, val id:Int)
val ins1 = new A(1,1)
val ins2 = new A(2,3)

if (ins1 eq ins2) println("same") else println("not same")

case class B(val id:Int, val name:String)

val ins5 = new B(1,"RV")
val ins6 = new B(1,"RV")
if (ins5 == ins6) println("same") else println("not same")


val cities = List("paris","san jose","madrid","ab","lv")
cities.map(x => x.length)


val string:String = "Mary has a little lamb"


def flat(string:String):Seq[Char] = {
  string.flatten(x => x).
}
