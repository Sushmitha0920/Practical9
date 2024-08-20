import scala.io.StdIn.readLine

object InterestCalculator {

    val calculateInterest: Double => Double = (depositAmount: Double) => {
        if (depositAmount <= 20000) {
            depositAmount * 0.02
        } else if (depositAmount <= 200000) {
            depositAmount * 0.04
        } else if (depositAmount <= 2000000) {
            depositAmount * 0.035
        } else {
            depositAmount * 0.065
        }
    }

    def main(args: Array[String]): Unit = {
        println("Enter the deposit amount : ")
        val depositAmount = readLine().toDouble

        val interest = calculateInterest(depositAmount)

        println(s"Deposit : Rs.$depositAmount")
        println(s"Interest : Rs.$interest")
    }
}