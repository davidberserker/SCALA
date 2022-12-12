package lectures.part1basics

object Expressions extends App {

  //A side effect is when a function relies on,
  // or modifies, something outside its parameters
  //to do something

  val x = 1 + 2 //Expression
  print(x)

  println(2 + 3 * 4)
  //Regular operators used in SCALA
  //+ - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  //Regular operators used in SCALA
  // == != > >= > <=

  println(!(1 == x))
  //! && ||

  var aVariable = 2
  aVariable += 3
  //also works with -= *= /= ...... side efects
  println(aVariable)

  //Instructions (DO) vs Expressions (VALUE)

  //IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println (aConditionedValue)
  println (1+3)

  //While loops should be avoided
  //While loops do not return a value and require side effects to
  //achieve anything It is a control structure which only works at all for very
  //simple tasks

  var i = 0
   while (i < 10){
     println(i)
     i += 1
   }
   //NEVER WRITE THIS AGAIN

   //EVERYTHING in Scala is an Expression!

   val aWeirdValue = (aVariable =3) //Unit === void
   //This only returns a () parentheses
  //Reassigning a variable is a side effect
  //Side effects in SCALA are actually expressions returning unit

   println(aWeirdValue)


  //side effects: println(), whiles, reassigning

  //Code blocks

  val aCodeBlock = {
    val y=2
    val z=y+1

    if(z > 2) "hello" else "goodbye"
  }
  //The last value wil give the variable the type



}