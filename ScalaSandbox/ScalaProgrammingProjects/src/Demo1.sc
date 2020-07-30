
def presentation(string:String, int:Integer):String = s"Hello from ${string} ${int}"

presentation("a",10)
presentation(int = 100,string = "hello")
val z = () => println("hello")

def Age(age:Int):Any = {
  if(age < 20) "young"
  else 1
}
println(Age(40))
val iffunc = if(true) 2 else 2.0
println(iffunc)

class Robot(val name:String){
  override def toString():String = {
    name
  };
}
val pl = new Robot("hello")
println(pl.name)
