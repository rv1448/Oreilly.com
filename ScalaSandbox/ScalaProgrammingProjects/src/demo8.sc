

val primes:LazyList[Int] = 2 #:: LazyList.from(3).filter{
  c =>
    val primelist: LazyList[Int] = primes.filter(p => p <= math.sqrt(c))
    !primelist.exists(x => c%x ==0)

}
//primes.take(10).force


val la =   3 #::11 #::LazyList.from(1).take(100)
la.
  filter {
    i => i < 10
  }.force

la.
  filter {
    i => i < 10
  }.force


val mapi = Map("one" -> 1, "two" -> 2)

val  mapu = mapi.map{
  case (key,value) => key.toUpperCase -> value
}

def mul(a:Int,b:Int):Int = {
  require(a >20 && b > 20)
  a *b
}

mul(22,22)