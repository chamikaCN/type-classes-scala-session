package lib

object _2_5_Issues {
  def test(age: Int) = s"Your age is ${age}"
  def test(age: Int, name: String = "John") = s"${name}'s age is ${age}"

  def main(args: Array[String]): Unit = {

    println(test(20))

    println(test(30,"Peter"))

  }
}
