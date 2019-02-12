package lectures.part1basics

object StringsOps extends App {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase)
  println(str.length)


  val aNumberString = "45"
  val aNumber = aNumberString.toInt

  println('a' +: aNumberString :+ 'z') // concatenate & append
  println(str.reverse)
  println(str.take(2))


  // Scala-specific : String Interpolators

  // S-interpolators
  val name = "Fernando"
  val age = 35
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello my name is $name and I'll turning ${age + 1} years old"

  println(greeting)
  println(anotherGreeting)

  // F-Interpolators (format)
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burger per minute"

  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline")

  val escaped = "This is a \n newline"
  println (raw"$escaped")

}
