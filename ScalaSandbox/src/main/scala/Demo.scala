object Demo extends App{

   case  class Amount(val amount:Double, val currency:String);
  val us_1 = Amount(10,"US")
  val us_2 = Amount(10,"US")
  val us_3 = Amount(10,"CANA")
  val us_4 = Amount(10,"UK")
  val us_5 = Amount(10,"UM")
  val us_6 = Amount(10,"B")

  val list = List(us_1,us_2,us_3,us_4,us_5,us_6)

  val test = (x: Amount) => x match  {
    case Amount(_,"US") => println("This is in us _ dollars ");
    case _ => println("this is not in us")
  }

  list.map(test(_))

}
