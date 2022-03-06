//函数类型作为返回值类型
fun getMathFunc(type: String): (Int) -> Int {
    fun square(n: Int): Int {
        return n * n
    }

    fun cube(n: Int): Int {
        return n * n * n
    }

    fun fact2(n: Int): Int {
        var result = 1
        for (index in 2..n) {
            result *= index
        }
        return result
    }

    when (type) {
        "s" -> return ::square
        "c" -> return ::cube
        else -> return ::fact2
    }
}

fun main(args: Array<String>) {
    var mathFun = getMathFunc("s")
    println(mathFun(5))

    mathFun = getMathFunc("c")
    println(mathFun(2))

    mathFun = getMathFunc("f")
    println(mathFun(5))
}