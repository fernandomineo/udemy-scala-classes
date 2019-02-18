package lectures.part2oop

import exercises.MyList

object Inheritance extends App {

  // single class inheritance
  sealed class Animal {
    //def eat = println("hmhmhmhm")  // private | protected
    val creatureType = "wild"
    def eatp = println("hmhmhmhm")
  }

  class Cat extends Animal {
    def crunch = {
      eatp
      println("crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  // Constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // Override
  class Dog(override val creatureType: String) extends Animal {
    //override val creatureType: String = "domestic"
    override def eatp = {
      super.eatp
      println("cruk cruk")
    }
  }
  val dog = new Dog("K9")
  dog.eatp
  println(dog.creatureType)

  // Type Substituion (broad : polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.creatureType

  // overRIDING vs overLOADING

  // Super

  // preventing overrides
  // 1 - use "final" on member
  // 2 - use "final" in entire class
  // 3 - seal the class = extend classes in THIS FILE, prevent extension in other files


}
