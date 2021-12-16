fun main() {
    var map = mapOf("Java" to 86, "Kotlin" to 92, "Go" to 76)
    // 判断是否所有key-value对的key的length都大于4，value都大于80
    println(map.all { it.key.length > 4 && it.value > 80 })
    // is there any one
    println(map.any { it.key.length > 4 && it.value > 80 })

    println("Java" in map)
    println("Go" !in map)

    // filter element in map
    val filteredMap = map.filter { "li" in it.key }
    println(filteredMap)

    // 将每个key-value对映射成新值，返回所有新值组成的Map集合
    val mappedList = map.map { "《疯狂${it.key}讲义》价格为：${it.value}" }
    println(mappedList)

    // get max value by key
    println(map.maxByOrNull { it.key })
    // get min value by value
    println(map.minByOrNull { it.value })

    var bMap = mapOf("Lua" to 67, "Erlang" to 73,"Kotlin" to 92)
    // plus is equivelent to union
    println(map + bMap)

    // minus , delete public element in two map
    // 输出结果并非注释所说，并未减去公共的元素
    println(map - bMap)
}
