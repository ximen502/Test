////lambda表达式虽然简单/方便，但是有一个严重缺陷，不能指定返回值类型。这时候可以使用匿名函数代替lambda表达式
fun main(args: Array<String>) {
    var test = fun(x: Int, y: Int): Int {
        return x + y
    }

    println(test(3, 5))
}