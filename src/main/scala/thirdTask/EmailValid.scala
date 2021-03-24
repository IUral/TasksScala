package thirdTask

import scala.io.StdIn.readLine
import scala.util.matching.Regex

class EmailValid extends IEmailValid {

  val emailPattern: Regex = "(^[a-zA-Z0-9]+[a-zA-Z0-9_]+)@{1}([a-z]+.{1}[a-z]+)+$".r

  override def runConsole(textOut: String): String = {
    print(textOut)
    readLine
  }

  override def emailValidate(email: String): String = email match {
    case _ if emailPattern.findFirstIn(email).isDefined => s"$email has valid"
    case _ => s"$email has not valid"
  }
}
