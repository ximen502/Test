import java.util.*

interface Testable {}

fun main(args: Array<String>) {
    val hello: Any = "Hello"
    println("whether string is a instance of String:${hello is String} ")
    println("whether string is a instance of Date:${hello is Date}")
    println("whether string implement the Testable protocol:${hello is Testable}")
    val a: String = "Hello"
//    println("is string a instance of Date:${a is Date}")
}