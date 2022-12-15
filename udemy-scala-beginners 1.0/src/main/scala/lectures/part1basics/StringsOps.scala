package lectures.part1basics

object StringsOps extends App{

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)


  val aNumberString ="45"
  val aNumber = aNumberString.toInt

  //Prepending are scalar specific
  println('a' +: aNumberString :+'z')
  println(str.reverse)
  println(str.take(2))

  //Scala-specific: String interpolations
  //S-interpolators
  val name = "David"
  val age = 28
  //In scala we can put inside of variables variables, or indent variables using s" "
  val greeting = s"Hello, my name is $name, and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name, and I will be turning ${age + 1} years old"
  println (anotherGreeting)

  //F-Interpolators
  //For formatted strings, similar to printf

  //f - interpolated formatted string
  //$ - Will expand value
  //%s - String
  //%2.2f - Float number format: 2 characters total, minimum. 2 decimals precision
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)


  //raw-interpolator
  //This ignores escaped characters inside of a string
  println(raw"This is a \n new line")
  private val escaped= "This is a \n new line"
  println (raw"$escaped")


  }
