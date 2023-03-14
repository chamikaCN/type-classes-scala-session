package old

object TypeClass2 {

  trait Summable[B] {
    def visualize(list: List[B]): B
  }

  object IntSummable extends Summable[Int] {
    override def visualize(list: List[Int]): Int = list.sum
  }

  object StringSummable extends Summable[String] {
    override def visualize(list: List[String]): String = list.mkString("")
  }

  def logList[A](list: List[A])(summable: Summable[A]): Unit = println(summable.visualize(list))

  def main(args: Array[String]): Unit = {
    logList(List(1,2,3))(IntSummable)
    logList(List("cat ","dog ","fish"))(StringSummable)
  }

}
