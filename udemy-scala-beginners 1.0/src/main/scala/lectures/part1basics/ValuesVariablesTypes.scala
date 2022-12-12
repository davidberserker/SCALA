package lectures.part1basics

object ValuesVariablesTypes extends App{

  //Vals are inmutable
  val x: Int = 42;
  println(x)
 //This cannot be made x=2
 //The types of val's are optional. This worls too: val x=42
 //Compiler can infer types
 val aString: String = "hello"
 val anotherString = "goodbye"

 val aBoolean: Boolean = false
 val aChar: Char = 'a'
 val anInt: Int = x
 val aShort: Short = 4562
 val aLong: Long = 4655151545548656546L
val aFloat : Float = 2.0f
val aDouble: Double = 3.14

//Variables
var aVariable: Int = 4
aVariable = 5 //side effects
//We can reassign values in variables
}
