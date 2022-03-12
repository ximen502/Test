//Lambda表达式的调用约定，如果函数的最后一个参数是个函数类型，并且准备传入一个lambda表达式作为参数，则允许在圆括号之外指定lambda表达式，
//这种用法许多语言都支持，成为尾随闭包(Tail Closure)
fun main(args: Array<String>) {
    var list = listOf("Java", "Kotlin", "Go")
    var rt = list.dropWhile() { it.length > 3 }
    println(rt)

    var map = mutableMapOf("赵一伤" to 40)
    list.associateTo(map) { "crazy${it}" to it.length }
    println(map)

    var rtx = list.reduce() { acc, e -> acc + e }
    println(rtx)
}