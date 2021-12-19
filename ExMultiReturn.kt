//数据类和返回多个值得函数
data class Result(
    val result: Int,
    val status: String
)

fun factorial(n: Int): Result {
    if (n == 1) {
        return Result(1, "success")
    } else if (n > 1) {
        return Result(factorial(n - 1).result * n, "success")
    } else {
        return Result(-1, "the param must > 0")
    }
}

fun main(args: Array<String>) {
    var (rt, status) = factorial(5)
    println(rt)
    println(status)

    //不关心的变量可以用_占位符号代替
    var (_, status2) = factorial(-5)
    println(status2)

    //系统为数据类生成的copy方法，可用于复制对象
    var result = Result(2, "unknown result")
    var oldRt = result.copy()
    println(oldRt)
}