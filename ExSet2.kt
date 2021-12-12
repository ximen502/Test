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

    // 对Set集合元素进行过滤，要求包含"li"
    val filteredList = set.filter { "li" in it }
    println(filteredList)
    // 返回集合中包含li的元素，找到就返回，找不到就返回null
    val foundStr = set.find { "li" in it }
    println(foundStr)
    // 返回集合中包含gang的元素，找到就返回，找不到就返回null
    val foundStr2 = set.find { "gang" in it }
    println(foundStr2)
    // 将set集合中所有的字符串拼接在一起
    val foldedList = set.fold("", { acc, e -> acc + e })
    println(foldedList)

    // 查找某个元素出现的位置
    println(set.indexOf("Go"))

    val mappedList = set.map { "《疯狂" + it + "讲义" }
    println(mappedList)
    // max
    println(set.maxOrNull())
    // min
    println(set.minOrNull())

    val reversedList = set.reversed()
    println(reversedList)

    var bSet = setOf("Lua", "Erlang", "Kotlin")
    //交集
    println(set intersect bSet)
    // 并集
    println(set union bSet)
    // 并集
    println(set + bSet)
    // set去除自身和bSet公共的元素
    println(set - bSet)
}

fun main() {
    ex2()
}
