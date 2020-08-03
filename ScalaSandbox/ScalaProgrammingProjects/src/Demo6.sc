

val string:String = "mary has a little lamb to eat"

def BoxingString(string:String):String = {
   val splitString = string.split(" ")
   val maxlength:Int = splitString.map(x => x.length).max

    val firstlast:String = "*" * (maxlength +4)
    val padded = splitString
        .map(x => x+(" " * (maxlength - x.length)))
        .map(x => s"* $x *").mkString("\n")

  firstlast ++ ("\n") ++padded++("\n")++firstlast

}
BoxingString(string)
BoxingString("HARRY IS A REPUBLICAN AND HE WANTS THE ENTIRE")
