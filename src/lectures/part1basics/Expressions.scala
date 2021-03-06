package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // expression
  println(x)
  println(2 + 3 * 4)
  // + - * / & | << >> >>>
  println(1 == x)
  // == != > >= < <=
  println(! (1 == x))
  // ! && ||
  var aVariable = 2
  aVariable += 3 // also works with -= *= /= .... side effects
  println(aVariable)

  //instructions(do) vs expressions(value)

  //if expresison
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 //if expression
  println(aConditionValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  //never write this again
  // everything in scala is an expression!
  val aWeirdValue = (aVariable = 3) // unit === void
  println(aWeirdValue)

  // side effects: println(), while, reassigning
  //code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  //val anotherValue = y +1 not use because y its inside de codeblock

  //1. diference between "hello world" vs println("hello world")?
  //2.

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)
}
