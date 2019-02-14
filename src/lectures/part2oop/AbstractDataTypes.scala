package lectures.part2oop

object AbstractDataTypes extends App {

  // Abstract
  abstract class Animal {
    val creatureType:  String
    def eat: Unit
  }

  class Dog extends Animal {
    val creatureType: String = "Canine"
    def eat: Unit = println("chunk chunk")
  }

  // traits

  trait Carnivore {
    def eat(animal: Animal) : Unit
  }

  class Crocodile extends Animal with Carnivore {
    val creatureType: String = "croc"
    def eat: Unit = println("crocrocorc")
    def eat(animal: Animal): Unit = println(s"I'm a crocodile and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croco = new Crocodile

  croco.eat(dog)

  // Traits vs Abstract classes
  // 1 - traits do not have constructor parameters
  // 2 - multiple traits may be inherited by same class
  // 3 - traits = behavior, abstract class = type of things

}
