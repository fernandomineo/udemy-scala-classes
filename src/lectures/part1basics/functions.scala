package lectures.part1basics

object functions extends App {

  def aFunction(a: String, b: Int) : String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aRepeatedFunction (aString: String, n : Int) : String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  //println(aRepeatedFunction("hello", 3))

  def aFunctionWithSideEffects(aString : String) : Unit = println(aString)

  def aBigFunction(n : Int) : Int = {
    def aSmallFunction(a: Int, b : Int) :Int = a + b

    aSmallFunction(n, n-1)
  }

  def Greeting(name : String, age : Int) : String = {
        "Hi, my name is " + name + " and I'm " + age + " years old"
  }
  println(Greeting("Fernando", 35))

  def factorial(n: Long) : Long = {
    if ((n == 0) || (n == 1)) 1
    else n * factorial(n-1)
  }
  println(factorial(15))

  def fibonaci(n : Long) : Long = {
    if ((n == 0) ||  (n == 1)) n
    else fibonaci(n-1) + fibonaci(n-2)
  }
  println(fibonaci(20))

  def testPrime(n: Int) : Boolean = {
    def isPrimeUtil(t: Int) : Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUtil(t-1)
    }
    isPrimeUtil(n / 2)
  }


  println(if (testPrime(5))  "YES" else "NO")

}
