import java.util.*

fun main(args: Array<String>) {


    val scanner = Scanner(System.`in`)
    println("a:")
    var a = scanner.nextDouble()
    println("+-*/")
    var c = scanner.next()
    println("b:")
    var b = scanner.nextDouble()

    Base(a, b, c)


}

fun Base(a: Double, b: Double, c: String) {
    var res = 0
    when (c) {
        "+" -> {
            res = (a + b).toInt()
            println("$a+$b=$res")
        }
        "-" -> {
            res = (a - b).toInt()
            println("$a-$b=$res")
        }
        "*" -> {
            res = (a * b).toInt()
            println("$a*$b=$res")

        }
        "/" -> {
            res = (a / b).toInt()
            println("$a/$b=$res")
        }
    }

}