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

/*
  Exercises
 1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old
 2. Factorial function 1 * 2 * 3 * ... * n
 3. Fibonacci function
 4. Test if a number is prime
*/

  def firstExercise (name: String, age: Int): String = {
  "Hi, my name is " + name + " and I am " + age + " years old."
}
  def secondExercise (number: Int) : Long ={

  if(number != 1)
    number * secondExercise(number -1)
  else
    1
}

  def thirdExercise (number: Int): Int ={
  if (number == 0)
    0
  else if (number == 1)
      1
  else
      thirdExercise(number-1) + thirdExercise(number - 2)
}

  def fourthExercise (number: Int): Boolean ={
    def isPrimeUntil (t: Int): Boolean= {
      if (t <=2)
        true
      else
        number % t != 0 && isPrimeUntil(t - 1)
    }
  isPrimeUntil(number/2)
  }
  println(firstExercise("David", 28))
  println(secondExercise(20))
  println(thirdExercise(5))
  println(thirdExercise(20))
  println(fourthExercise(37))
  println(fourthExercise(2003))
  println(fourthExercise(37 *17))

}
