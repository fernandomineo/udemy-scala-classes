package lectures.part1basics

object valuesvariables extends App {

  // VALS ARE IMUTABLE
  // COMPILER CAN INFER TYPES

  val x: Int = 42
  //println(x)

  val aString : String = "hello"
  //println(aString)

  val aBoolean : Boolean = false
  val aChar : Char = 'a'
  val aInt: Int = x
  val aShort : Short = 1
  val aLong : Long = 9999990000L
  val aFloat : Float = 2.0F
  val aDouble : Double = 3.14

  // Variable
  var aVariable : Int = 4
  aVariable = 5 // side effects

  var a : Long = 5
  var b : Long = 4
  var c : Long = 2
  println(a/b)
  println(a/c)
  println(a%b)
  println(a%c)
}
