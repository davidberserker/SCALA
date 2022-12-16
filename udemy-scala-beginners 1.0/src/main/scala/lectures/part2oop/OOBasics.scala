package lectures.part2oop

import org.w3c.dom.css
import org.w3c.dom.css.Counter

object OOBasics extends App{

  val person = new Person("John",26)
  println(person.age)
  person.greet("Daniel")

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println("The author novel age is: " + novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter ()
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
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

  //Class parameters are NOT FIELDS
  //Class parameters and class fields are not the same
  //To convert a parameter into a field you should use VAL


}

/*

  Exercise
  create novel and a writer

writer: first name, surname , year
- method fullname

Novel: name, year of release, author
-authorAge
-iswrittenBy(author)
-copy (new year of release) = new instance of Novel


*/

class Writer (val name: String, val surname: String,val year: Int){

  def fullName:  String = name + " " + surname
}

class Novel (val name: String, val year: Int, val author:Writer){

  def authorAge = year - author.year
  def isWrittenBy (author: Writer) = author ==this.author
  def copy(newYear: Int): Novel = new Novel (name, newYear, author)
}


/*
Counter class
- Receives an int value
- Method current count
- Method to increment/decrement => new counter
- Overload inc/dec to receive an amount
* */

class Counter ( val count: Int = 0){
  def inc = {
    println("Incrementing...")
    new Counter (count + 1)
  } //inmutability
  def dec = {
    println("Decrementing...")
    new Counter (count - 1)
  }

  //Overload of methods
//  def  inc (n: Int) = new Counter (count + n)
//  def  dec (n: Int) = new Counter (count - n)
//Instead of lloping we want recursion

  def inc(n: Int) : Counter = {
    if (n<= 0) this
    else  inc.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def print = println(count)
}

