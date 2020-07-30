


val add =(a:Int, b:Int) => a+b:Int;
val add:(Int, Int) => Int = (a,b) => a+b;
def add3(a:Int, b:Int):Int  = a+b



def parseAndreturn(input:String,f:(Int, Int) => Int):Int = {
  val a = input.split(",")(0).toInt
  val b = input.split(",")(1).toInt
  f(a,b)
}

val m = parseAndreturn("1,2", _+_)
println(m)

val parse=(x:Int, y:Int) =>x+y:Int
val parsev2:(Int,Int) => Int =(x,y) =>  x+y
val add:(Int, Int) => Int = (a,b) => a+b;


 def func(a:Int, b:Int):Int = a match {
   case a if (a > 20) => a
   case _ => b
 }
println(func(30,1))


val func1 = (i:Int) =>  i match {
  case i if i>20 => i
}
