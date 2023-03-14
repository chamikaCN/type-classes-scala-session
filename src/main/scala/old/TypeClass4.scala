package old

import scala.language.implicitConversions

object TypeClass4 {

  trait Summable[B] {
    def visualize(list: List[B]): B
  }

  //  implicit val IntSummable: Summable[Int] = new Summable[Int] {
  //    def visualize(list: List[Int]): Int = list.sum
  //  }
    implicit val IntSummable: Summable[Int] = (list: List[Int]) => list.sum


  //  implicit val StringSummable : Summable[String] = new Summable[String] {
  //    def visualize(list: List[String]): String = list.mkString("")
  //  }
    implicit val StringSummable : Summable[String] = (list: List[String]) => list.mkString("")

  def logList[A](list: List[A])(implicit summable: Summable[A]): Unit = println(summable.visualize(list))

  def main(args: Array[String]): Unit = {
    logList(List(1, 2, 3))
    logList(List("cat ", "dog ", "fish"))
  }

}
