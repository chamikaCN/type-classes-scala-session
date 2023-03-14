package lib

object _1_Show_Functionality {

  //Requirement -> To implement different and unique show methods based on the type

  case class Person(name:String, age:Int)
  def main(args: Array[String]): Unit = {

    //String
    println("String")

    //Integer
    println(23)

    //Boolean
    println(true)

    //Complex
    println(Person("John",15))
  }

  //given X of Any type it should show value in a type-specific way
}
