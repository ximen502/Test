//使用匿名函数作为方法的参数，这个时候不能在filter后面直接使用大括号，而要用圆括号，括号里面是匿名函数参数。
// 如果filter后面直接跟大括号，那么大括号里面就是lambda表达式了，大括号里面无法使用匿名函数
fun main(args: Array<String>) {
    var filteredList = listOf(3, 5, 20, 100, -25).filter(
        fun(e): Boolean { return Math.abs(e) > 20 }
    )

    println(filteredList)
}