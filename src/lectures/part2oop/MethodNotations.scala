package lectures.part2oop

object MethodNotations extends App {


  class Person(val name: String, favoriteMovie : String, val age: Int = 0) {
    def likes(movie: String) : Boolean = movie == favoriteMovie
//  def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
// can be replaced with + as below:
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String  = s"$name, what a hell ?"
    def isAlive: Boolean = true
    def apply() : String = s"Hi, my name is $name and I like $favoriteMovie"
    def print: String = this.name +" "+ this.favoriteMovie + " "+ this.age

    // Ex 1
    def +(input: String): Person = new Person (s"$name ($input)", favoriteMovie, age)
    // Ex 2
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    //Ex 3
    def learns(s: String) : String = s"$name is learning $s"
    def learnsScala = this learns "Scala"
    // Ex 4
    def apply(i: Int): String = s"${this.name} watched ${this.favoriteMovie} $i times"
  }

  val mary = new Person("Mary", "Inception")
  //println(mary.likes("Inception"))
  //println(mary likes "Inception")      // equivalent with above
  // infix notation = operator notation (Syntactic Sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  //println(mary hangOutWith tom)
  //println(mary.hangOutWith(tom))

  // println(mary + tom)
  // println(mary.+(tom))

  // Same as:
  //println(1 + 2)
  //println(1.+(2))

  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?

  // Prefix notation
  val x = -1  // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix oly works with - + ~ !

 /* println(!mary)
  println(mary.unary_!)

  // posfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary()) // equivalent

  */
  /*
    1. Overload the + operator
        mary + "the rockstar" => new person "Mary (The rockstar)"
  */
  println ((mary + "The Rockstar")()) // Same as "mary.+("The Rockstar").apply()"
  /*
    2.  Add an age to the Person class
        Add a unary_+ operator => new person with the age + 1
        +mary => mary with age incremented.
  */
  val m = +mary
  println((+mary).age)
  /*
    3.  Add a "learns" method in the person class = > "mary learns scala"

        Add a learnsscala method, calls learns method with scala
        Use it in posfix notation.
  */
  println(mary learnsScala)
  /*
    4.  Overload the apply method
        marry.apply(2) => "mary watched Inception 2 times"
   */
  println(mary.apply(2))


}
