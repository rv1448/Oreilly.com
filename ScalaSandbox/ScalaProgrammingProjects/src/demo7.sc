val  level = "info"



def getBalance(username:String):String = {
  println("DB: getting  User Balance")
  s"The user:${username} has 100 USD "
}:String

def getBalanceAmount(username:String,salary:Double) = {
  println("The amount is being triggered")
  s"The user: ${username} and Salary: ${salary}"
}

def debug(text:String,param:String)=
  if(level == "debug"){
    println(text.replace("{ }",param))
  }

def debugV2(text:String,param:() =>  String) =
  if(level == "debug"){
    println(text.replace("{ }",param()))
  }
def debugV3(text:String,param:() => String) = {
  if(level == "debug"){
    println(text.replace("{ }",param()))
  }


  def debugV4(text:String,param: => String) = {
    if(level == "debug"){
      println(text.replace("{ }",param))
    }
  }


  debug("James has { } in his balance",getBalance("james"))
println("test")
debugV2("James has { } in his balance",() => getBalance("james"))
debugV2("James has { } in his balance",() => getBalanceAmount("james",100) )
  debugV4("James has { } in his balance",() => getBalanceAmount("james",100) )