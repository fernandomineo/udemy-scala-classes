package lectures.part1basics

object Recursion extends App {

  def factorial(n: Int) : Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }
  // print(factorial(10))

  def anotherFactorial(n: Int) :  BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSIVE == User recursive call as the LAST expression

    factHelper(n,1)
  }
 // println(anotherFactorial(200000))

  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION

  // 1: Concatenate as String N times.
  def Greeting(input : String,n : Int) : String = {
    def GreetingHelper(input: String, n: Int, acc: String): String = {
      if (n <= 0) acc
      else GreetingHelper(input,n-1, input + " " + acc)
    }
    GreetingHelper(input, n, " ")
  }
  //println(Greeting("Hello", 10))

  //  Solution from course (1):
  def concatateTailRec(aString: String, n: Int, acc: String): String =
    if (n <= 0) acc
    else concatateTailRec(aString, n-1, aString + acc + " ")

  // println(concatateTailRec("hello", 4, ""))

  // 2: isPrime functions tail recursive
  def isPrime(n: BigInt) : Boolean = {
    def isPrimeUtil(t: BigInt) : Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUtil(t-1)
    }
    isPrimeUtil(n / 2)
  }
  //println(isPrime(999999997))

  //  Solution from course (2):
  def isPrime(n: Int) : Boolean = {
    def isPrimeTailRec(t: Int, isStillPrime: Boolean) : Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    isPrimeTailRec(n / 2, true)
  }
  println(isPrime(999999997))

  // 3: Fibonacci function, tail recursive
  def fibonaci(n : BigInt) : BigInt = {
    def fibonaciHelper(aux : BigInt, acc : BigInt) : BigInt = {
      if (n <= 1) aux
      else {
         acc + fibonaciHelper(n-1,acc) + fibonaciHelper(n-2, acc)
      }
    }
    fibonaciHelper(n,0)
  }
  //println(fibonaci(5))

  //  Solution from course (3):
  def fibonaciSolution(n : Int) : Int = {
    def fiboTailRec (i: Int, last: Int, nextToLast: Int) : Int = {
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fiboTailRec(2,1,1)
  }

  println(fibonaciSolution(8))


}
