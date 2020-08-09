

val func = (s:Int) =>   s+1:Int


 val func:Int => Int = s=>  s+1

 val add =(a:Int, b:Int) => a+b:Int;
 val add:(Int, Int) => Int = (a,b) => a+b;
 def add3(a:Int, b:Int):Int  = a+b


 case class Username(name:String, id:Int)

 val account1 = Username("rb",1)
 val account2 = account1.copy(name="rs")
val na:String  = account1.name


List(account1, account2).map {acc =>
val newAge:Int = acc.id +1
acc.copy(id = newAge)
}


