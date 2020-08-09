

val list = List("james","ruth","isabel","tom","jerry")

val name = list.filter{n =>
  println(s"Checking $n")
  n.length < 5
}.map{n =>
  println(s"toUpper $n")
  n.toUpperCase
}

val lazyName = LazyList("james","ruth","isabel","tom","jerry")

val nameStream = lazyName.filter { n =>
  println(s"Checking $n")
  n.length < 5
}.map{n =>
  println(s"toUpper $n")
  n.toUpperCase
}
nameStream(1)


def fibonacci(n:Int):Int  = if(n <=1) 1 else fibonacci(n-2)+fibonacci(n-1)



val s2:LazyList[Int] = LazyList.from(2)


val list1 = List(1,2,3,4)
val list2 = List(1,2,3,4)

list1.zip(list2).map(t => t._1 + t._2) ++List(1,2,4)

