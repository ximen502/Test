fun ex2() {
    var set = setOf("Java", "Kotlin", "GO")
    // 判断是否所有元素长度都大于4
    println(set.all { it.length > 4 })
    // any element length > 4
    println(set.any { it.length > 4 })

    // 以lambda表达式的值为key，集合元素为value,组成Map集合
    val map = set.associateBy { "《疯狂" + it + "讲义》" }
    println(map)

    // 由于有contains()方法，所以可用in, !in运算符
    println("Java" in set)
    println("GO" !in set)

    // 返回删除前2个元素的集合
    val droppedList = set.drop(2)
    println(droppedList)
}

fun main() {
    ex2()
}
