//函数的形参，命名参数
fun girth(width: Double, height: Double): Double {
    println("width:${width}")
    println("height:${height}")
    return 2 * (width + height)
}

fun main(args: Array<String>) {
    println(girth(5.0, 9.0))
    println(girth(width = 6.0, height = 4.0))
    println(girth(height = 8.0, width = 2.0))
    println(girth(3.0, height = 7.0))
}