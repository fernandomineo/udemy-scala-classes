package lectures

object Objects {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { // type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person) : Person = new Person("Bob")
  }
  class Person(val name: String) {
    // instance-level functionality
  }
  // COMPANIONS
  def main(args: Array[String]): Unit = {
    println(Person.N_EYES)
    println(Person.canFly)

    // Scala object = SINGLETON INSTANCE
    val mary = new Person("Mary")
    val tom = new Person("Tom")
    println(mary == tom)

    val person1 = Person
    val person2 = Person
    println(person1 == person2)

    val bob = Person(mary,tom)
  }
  // Scala Applications =  Scala Object with
  // def main(args: Array[String]): Unit

}
