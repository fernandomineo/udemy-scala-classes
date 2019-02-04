package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)
  // + - * /  & | ^ << >> >>> (right shift with zero extension)

  println (1 == x )
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVar = 2
  aVar += 3 // also works with -= *= /= ... side  effects
  println(aVar)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionValue)

  // EVERYTHING IN SCALA IS A EXPRESSION!!!

  val aWeirdValue = (aVar = 3) // Unit == void
  println (aWeirdValue)

  // side effects: println, whiles, reassigning

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 2
    if (z > 2) "hello" else "goodbye"
  }


}
