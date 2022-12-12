package lectures.part1basics

object Functions extends App{

  //In order to declare a function we declare some attributes
  //in this example will be a and b, then we especify if the function
  //returns any value and the type of that value
  def aFunction(a: String, b: Int) : String = {
      a + " " + b  //String concatenation

  }

  println(aFunction("hello", 3))

  def aPArameterlessFunction():Int =42

  println(aPArameterlessFunction())
  //println(aPArameterlessFunction)

  //This is a recursive function
  def aRepeatedFunction (aString: String, n: Int): String = {
    if (n == 1) aString
    else
      aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  //WHEN YOU NEED LOOPS, USE RECURSION
  //But be aware that recursive functions will need always a type defined fot return

  //In case we need to return an Unit...
  def aFunctionWithSideEffects (aString: String): Unit = println (aString)


  //We can also use functions inside of an existing function
  def aBigFunction(n: Int): Int ={
    def aSmallerFunction(a: Int, b: Int): Int= a+ b
      aSmallerFunction(n,n-1)
  }
  println(aBigFunction(2))



}
