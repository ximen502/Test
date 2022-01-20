// 下面定义了4个宏变量，其实就是常量
const val a = 5 + 2
const val b: Double = 1.2 / 3
const val str: String = "疯狂" + "Java"
const val book: String = "疯狂Java讲义:" + 99.0
const val d = 99.0
const val book2: String = "疯狂Java讲义:" + d

fun main(args: Array<String>) {
    println(book2 === "疯狂Java讲义:99.0")
}