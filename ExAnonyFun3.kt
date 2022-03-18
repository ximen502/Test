//定义匿名函数的函数体是单表达式，可以省略声明函数的返回值类型
fun main(args: Array<String>) {
    var wawa = fun(x: Int, y: Int) = x + y
    // 通过wawa调用匿名函数
    println(wawa(5, 6))

    var rt = listOf(3, 5, 20, 100, -25).filter(
        fun(el) = Math.abs(el) > 20
    )
    println(rt)
}