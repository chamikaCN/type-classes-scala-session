package lib

object _3_Implicit_Parameters {

  case class Person(name: String, age: Int)

  private val intVisual: (Int => String) = (value: Int) => s"Integer Value of ${value}"

  private val strVisual: (String => String) = (value: String) => "The text is " + value

  private val perVisual: (Person => String) = (value: Person) => s"I am ${value.name}"

  private def show[A](value: A) (fn: A => String): Unit = println(fn(value))

  def main(args: Array[String]): Unit = {
    show(3)(intVisual)
    show("TEST STRING")(strVisual)
    show(Person("John", 15))(perVisual)
  }

//  implicit val intVisual: Int => String = (value: Int) => s"Integer Value of ${value}"
//
//  implicit val strVisual: String => String = (value: String) => "The text is " + value
//
//  implicit val perVisual: Person => String = (value: Person) => s"I am ${value.name}"
//
//  private def show[A](value: A)(implicit fn: A => String): Unit = println(fn(value))
//
//  def main(args: Array[String]): Unit = {
//    show(3)
//    show("TEST STRING")
//    show(Person("John", 15))
//  }

}
