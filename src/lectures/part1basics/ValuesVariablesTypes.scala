package lectures.part1basics

object ValuesVariablesTypes extends App{
  val x: Int = 42
  println(x)

  //val is inmutable
  //compiler infer types

  val aString: String = "hello friend"
  val anotherString = "Goodbye friend"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 1234
  val aLong: Long = 12122344343434L
  val aFloat: Float = 1.5f
  val aDouble: Double = 12.3

  //variables
  var aVariable: Int = 4
  aVariable = 5 //side effects

}
