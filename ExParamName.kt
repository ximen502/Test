//lambda式省略形参名
//只有一个形参的情况，形参名是可以省略的，这样it即可代表形参进行运算
//多于1个形参的情况是无法省略的
fun main(args: Array<String>) {
    var square: (Int) -> Int = { it * it }
    println(square(5))
    println(square(9))

    var result = { base: Int, exponent: Int ->
        var result = 1
        for (i in 1..exponent) {
            result *= base
        }
        result
    }(2, 4)
    println(result)

    var list = listOf("Java", "Kotlin", "Go")
    var rt = list.dropWhile { it.length > 3 }
    println(rt)
}