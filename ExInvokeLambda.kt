/*
{(形参列表) ->
//零条到多条执行语句
}
*/
fun main(args: Array<String>) {
    // 定义一个lambda表达式，将它赋值给一个变量
    var square = { n: Int ->
        n * n
    }

    println(square(5))
    println(square(6))

    //定义一个lambda表达式，并在它后面添加圆括号来调用该Lambda表达式
    var exp = { base: Int, exponent: Int ->
        var result = 1
        for (i in 1..exponent) {
            result *= base
        }
        result
    }(4, 3)
    println(exp)

}