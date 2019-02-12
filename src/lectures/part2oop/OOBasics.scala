package lectures.part2oop

object OOBasics extends App{

  val person = new Person("John", 34)
  println(person.x)
  person.greet("Fernando")
  person.greet()

}
// constructor
// class parameter are NOT FIELDS (add val in front of variable to be "accessible")
class Person(name: String, val age: Int) {
  // body
  val x = 2

  println(1 + 3)

  // method
  def greet(name: String) : Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("Mineo")


}

/*
  Ex 1:
  Novel and a Writer

  Writer: first name, surname, year
    - method fullname
  Novel: name, year of release, author
    - authorAge
    - isWritenBy (author)
    - copy (new year of release = new instance of Novel

  Ex 2:
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive a amount
 */



