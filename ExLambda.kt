//使用lambda表达式代替局部函数
fun getMathFunc2(type: String): (Int) -> Int {
    when (type) {
        "s" -> return { n: Int ->
            n * n
        }
        "c" -> return { n: Int ->
            n * n * n
        }
        else -> return { n: Int ->
            var result = 1
            for (i in 1..n) {
                result *= i
            }
            result
        }
    }
}

fun main(args: Array<String>) {
    var mathFun = getMathFunc2("s")
    println(mathFun(6))

    mathFun = getMathFunc2("c")
    println(mathFun(4))

    mathFun = getMathFunc2("f")
    println(mathFun(6))
}