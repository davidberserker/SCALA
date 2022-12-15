package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App{

  /*def trFactorial (n:Int, acc: Int): Int ={
    if (n<=1) acc //accumulator
    else trFactorial(n-1, n*acc)
  }

  val fact10 = trFactorial(10 ,1)*/ //In this case we need to specify always the number of accumulator
  //But in real life that's kind of slow, so Scalar let us assign a default value for an specific variable


  //So if we don't pass the accumulator it always be one
  @tailrec
  private def trFactorial(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc //accumulator
    else trFactorial(n - 1, n * acc)
  }
 //But it doesn't mean it can't be changed
  val fact10 = trFactorial(10)
  private def savePicture (format: String = "jpg", width: Int, height: Int): Unit = println("Saving picture")

  //The next code confuse the compiler
 //savePicture(800, 600)
  savePicture(width = 800, height = 200)
 //sometimes the compiler doesn't know to wich of the variables pass the value
 //So we have 2 options

 /*
    1. Pass in every leading argument
    2. Name the arguments
 */
}
