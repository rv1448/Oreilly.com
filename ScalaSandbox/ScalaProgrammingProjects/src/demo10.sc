
def sum(list:List[Int]) : Int = list match {
  case Nil => 0
  case h::t => h + sum(t)
}

sum(List(10,9,8,7,7))

val a: List[Int]= List(10,9,8,7,7)
  a.reduce(_+_)

def swap(list:List[Int]):List[Int] = {
  list match {
    case a :: b :: c => b::a::c
    case _ => list
  }

}

swap(a)



abstract class Expression(op1:Double,op2:Double)

case class Addition(op1:Double,op2:Double) extends Expression(op1,op2)
case class Subtraction(op1:Double,op2:Double) extends Expression(op1,op2)
case class Division(op1:Double,op2:Double) extends Expression(op1,op2)
case class Multiplication(op1:Double,op2:Double) extends Expression(op1,op2)



object Resolver{
  def resolve(expression: Expression): Option[Double] = {

    println("Hllo")
    expression match {
      case Addition(op1, op2) => Some(op1 + op2)
      case Subtraction(op1, op2) => Some(op1 - op2)
      case Division(op1, 0) => None
      case Division(op1, op2) => Some(op1 / op2)
      case Multiplication(op1, op2) => Some(op1 * op2)

    }
  }

  def main(args:Array[String]):Unit = {
    println("Gelo")
   resolve(Addition(1,2)).map(println)
  }
}

 Resolver.resolve(Addition(1, 2))