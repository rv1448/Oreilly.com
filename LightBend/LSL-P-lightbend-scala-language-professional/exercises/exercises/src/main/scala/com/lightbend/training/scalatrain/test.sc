sealed trait Flavor
case object Vanilla extends Flavor
case object Chocolate extends Flavor
case object Strawberry extends Flavor

case class Person(name: String)

val favoriteFlavors: Map[Person, Flavor] = Map(Person("Lupita") -> Vanilla, Person("Johnny") -> Chocolate, Person("Sarah") -> Strawberry, Person("Takashi") -> Vanilla)

val peopleWhoLikeVanilla: Map[Person, Flavor] = favoriteFlavors.filter {
  case (_, v) => v == Vanilla
}

val allCharacters: Iterable[Char] = favoriteFlavors.flatMap{
  case (k, _) => k.name
}

val firstInitials: Iterable[Char] = favoriteFlavors.map {
  case (k, _) => k.name.head
}
