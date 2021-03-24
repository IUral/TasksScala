import org.scalatest.funsuite.AnyFunSuite
import thirdTask.EmailValid

class ThirdTaskTestSuite extends AnyFunSuite{

  val emails = List(
    "mail@mail.ru" -> true,
    "4mail@mail.ru" -> true,
    "mail_@mail.ru" -> true,
    "mail@mail.ru.com" -> true,
    "_mail@mail.ru" -> false,
    "m-ail@mail.ru" -> false,
    "m@ail@mail.ru" -> false,
    "mail@mail.ru." -> false,
    "mail@mail..ru" -> false,
    "mail@mail._ru" -> false
  )

  val thirdTask = new EmailValid

  for(email <- emails) {
    if(email._2)
      test(s"testing valid: ${email._1}") {
        assert(s"${email._1} has valid" == thirdTask.emailValidate(email._1))
    }
    else
      test(s"testing not valid: ${email._1}") {
        assert(s"${email._1} has not valid" == thirdTask.emailValidate(email._1))
      }
  }
}
