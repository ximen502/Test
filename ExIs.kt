import java.util.*

interface Testable {}

fun main(args: Array<String>) {
    val hello: Any = "Hello"
    println("whether string is a instance of String:${hello is String} ")
    println("whether string is a instance of Date:${hello is Date}")
    println("whether string implement the Testable protocol:${hello is Testable}")
    val a: String = "Hello"
//    println("is string a instance of Date:${a is Date}")

    // is auto transform to target type
    var b: Any = "zhaoyishang"
    //编译时类型是Any，因此编译时没有length属性
//    println(b.length)
//is判断后类型自动转换为String
    if (b is String) println(b.length)
}