import scala.io.StdIn.readLine

object IntegerClassifier {

    val classifyInteger: Int => String = (integer: Int) => {
        integer match {
            case n if n <= 0 => "Negative/Zero is input"
            case n if n % 2 == 0 => "Even number is given"
            case _ => "Odd number is given"
        }
    }

    def main(args: Array[String]): Unit = {
        println("Enter an integer : ")
        val input = readLine().toInt

        val result = classifyInteger(input)

        println(result)
    }
}