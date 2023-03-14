package lib

object _4_Type_Classes {

  case class Person(name: String, age: Int)

  trait Visualizer[M] {
    def visualize(value: M): String
  }

  implicit val IntVisualizer: Visualizer[Int] = new Visualizer[Int] {
    override def visualize(value: Int): String = s"Integer Value of ${value}"
  }

  implicit val StrVisualizer: Visualizer[String] = new Visualizer[String] {
    override def visualize(value: String): String = "The text is " + value
  }

  implicit val PerVisualizer: Visualizer[Person] = new Visualizer[Person] {
    override def visualize(value: Person): String = s"I am ${value.name}"
  }

//  implicit object IntVisualizer extends Visualizer[Int]{
//    override def visualize(value: Int): String = s"Integer Value of ${value}"
//  }
//
//  implicit object StrVisualizer extends Visualizer[String] {
//    override def visualize(value: String): String = "The text is " + value
//  }
//
//  implicit object PerVisualizer extends Visualizer[Person] {
//    override def visualize(value: Person): String = s"I am ${value.name}"
//  }

  private def show[A](value: A)(implicit visualizer: Visualizer[A]): Unit = println(visualizer.visualize(value))

  def main(args: Array[String]): Unit = {
    show(3)
    show("TEST STRING")
    show(Person("John", 15))
  }

}
