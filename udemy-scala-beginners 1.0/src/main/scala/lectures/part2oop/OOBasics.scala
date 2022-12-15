package lectures.part2oop

object OOBasics extends App{

  val person = new Person("John",26)
  println(person.age)
  person.greet("Daniel")
}

//Class constructor () like the next code
 class Person (name: String, val age: Int) {
  //body
  val x= 2 //(Fields)
  println(1+3) //And can also have expressions that will be executed every time is accessed

  def greet (name:String): Unit = println(s"${this.name} says: Hi, $name")
  //If you use this. It'll take the name of John instead of the Daniel

  //We can use algo overloading of methods always using different signatures
  //In the next code the name field this. is implied
  def greet (): Unit = println(s"Hi, I am $name")

  //Multiple constructors
  def this (name:String) = this(name,0)
  def this() = this ("John Doe")


}

//Class parameters are NOT FIELDS
//Class parameters and class fields are not the same
//To convert a parameter into a field you should use VAL