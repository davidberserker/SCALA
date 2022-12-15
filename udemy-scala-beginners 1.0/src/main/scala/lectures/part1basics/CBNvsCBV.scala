package lectures.part1basics

/*
Created by David on 15/Dec/22
Call by Name or Call by Value functions
*/
object CBNvsCBV extends App {
  def calledByValue(x: Long): Unit = {
    println("by value " + x)
    println("by value " + x)
  }

  // If we use => it tell the compiler that it'll be calling the name instead of the value
  def calledByName(x: => Long): Unit = {
    println("by name " + x)
    println("by name " + x)
  }


  //When we use called by value the expression is first evaluated and then executed
  calledByValue(System.nanoTime())


  //when we use called by name, the expression will be evaluated in the runtime
  //Is the same as put into the def function
  // println("by name" + System.nanoTime())
  // So its evaluated until we need that information
  calledByName(System.nanoTime())

  //Examples
  private def infinite(): Int = 1 + infinite()

  private def printFirst(x: Int, y: => Int): Unit = println(x)

  //If we run the next code it'll crash because is stack overflow
  //printFirst(infinite(), 34)


  //But in here it doesn't affect because is never used the second parameter of the function
  printFirst(34, infinite())


}
