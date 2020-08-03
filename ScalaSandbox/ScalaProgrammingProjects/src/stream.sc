

val list = List("james","ruth","isabel","tom","jerry")

val name = list.filter{n =>
  println(s"Checking $n")
  n.length < 5
}.map{n =>
  println(s"toUpper $n")
  n.toUpperCase
}

val lazyName = LazyList("james","ruth","isabel","tom","jerry")

val nameStream = lazyName.filter{n =>
  println(s"Checking $n")
  n.length < 5
}.map{n =>
  println(s"toUpper $n")
  n.toUpperCase
}
nameStream(1)


def fibonacci(n:Int):Int  = if(n <=1) 1 else fibonacci(n-2)+fibonacci(n-1)
