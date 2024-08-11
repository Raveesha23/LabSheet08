import scala.io.StdIn._


def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val input = readLine().toInt

    val multipleOfThree = (n: Int) => n % 3 == 0
    val multipleOfFive = (n: Int) => n % 5 == 0

    val result = (multipleOfThree(input), multipleOfFive(input)) match {
        case (true, true) => "Multiple of Both Three and Five"
        case (true, false) => "Multiple of Three"
        case (false, true) => "Multiple of Five"
        case (false, false) => "Not a Multiple of Three or Five"
      }

    println(result)

}