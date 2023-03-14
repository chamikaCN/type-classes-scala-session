package old

import scala.language.implicitConversions

object TypeClass3 {

  implicit def visualize(list: List[Int]): Int = list.sum

  implicit def visualize(list: List[String]): String = list.mkString("")

  def logList[A](list: List[A])(implicit fn:List[A] => A): Unit = println(fn(list))

  def main(args: Array[String]): Unit = {
    logList(List(1,2,3))
    logList(List("cat ","dog ","fish"))
  }

}
