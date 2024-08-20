object NameFormatter {

    val toUpper: String => String = (str: String) => str.toUpperCase()

    val toLower: String => String = (str: String) => str.toLowerCase()

    def formatNames(name: String)(formatFunc: String => String): String = {
        formatFunc(name)
    }

    def main(args: Array[String]): Unit = {
        println(formatNames("Benny")(toUpper))

        println(formatNames("Niroshan")(name => toUpper(name.substring(0, 2)) + toLower(name.substring(2))))

        println(formatNames("Saman")(toLower))

        println(formatNames("Kumara")(name => toUpper(name.head.toString) + toLower(name.substring(1, name.length - 1)) + toUpper(name.last.toString)))
    }
}