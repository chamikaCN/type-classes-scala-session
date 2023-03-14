package lib

object _2_Overloading {
  case class Person(name:String, age:Int)

  def visualize(value: Int): String = s"Integer Value of ${value}"

  def visualize(value: String): String = "The text is " + value

  def visualize(value: Person): String = s"I am ${value.name}"

  def main(args: Array[String]): Unit = {
    visualize(3)
    visualize("TEST STRING")
    visualize(Person("John",15))
  }
}
