// 非局部返回，lambda表达式中的return并不是用于返回表达式，而是用于返回表达式所在的函数。
//如果函数用inline修饰，参数的表达式中允许使用return，否则不允许使用return，会提示
//return is not allowed here!
inline fun each(data: Array<Int>, fn: (Int) -> Unit) {
    for (el in data) {
        fn(el)
    }
}

fun main(args: Array<String>) {
    var arr = arrayOf(20, 4, 40, 100, 30)
    each(arr) {
        println(it)
        return
    }
}