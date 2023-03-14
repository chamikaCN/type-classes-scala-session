package old

object TypeClass {

  trait Summable[B] {
    def visualize(list: List[B]): B
  }

  implicit object IntSummable extends Summable[Int] {
    override def visualize(list: List[Int]): Int = list.sum
  }

  implicit object StringSummable extends Summable[String] {
    override def visualize(list: List[String]): String = list.mkString("")
  }

  def logList[A](list: List[A])(implicit summable: Summable[A]): Unit = println(summable.visualize(list))

  def main(args: Array[String]): Unit = {
    logList(List(1,2,3))
    logList(List("cat ","dog ","fish"))
  }

}
