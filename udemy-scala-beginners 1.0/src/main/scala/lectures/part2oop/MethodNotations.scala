package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?"
    def isAlive : Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))

  //But we can use also the next expression
  println(mary likes "Inception")
  //It's called infix notation = operator notation (also called syntactic sugar)
  //Object method parameter

  // "Operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))
  //Scala can use signs as name of functions

  //Actually ALL OPERATORS ARE METHODS
  println( 1 + 2 )
  println(1.+(2) )

  //Prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  //unary_prefix only works with - + ~
  println (!mary)
  println (mary.unary_!)

  //postfix notation
  //It's only available to methods without parameters
  println(mary.isAlive)
  println(mary isAlive)

  //Apply
  println (mary.apply())
  //If we call mary() it will look up for the method Apply()
  println(mary())

}
