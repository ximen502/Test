// 利用上下文推断出Lambda表达式的形参类型，则可以省略形参类型
fun main(args: Array<String>) {
    //get type ok
    var square: (Int) -> Int = { n -> n * n }
    println(square(5))
    println(square(7))

    // get type ok
    var list = listOf("Java", "Kotlin", "Go")
    var rt = list.dropWhile { e -> e.length > 3 }
    println(rt)
}
