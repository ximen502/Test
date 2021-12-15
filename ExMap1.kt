fun main() {
    var map = mapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
    println(map)

    var mutableMap = mutableMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
    println(mutableMap)

    println("mapOf返回对象的实际类型是:${map.javaClass}")
    println("mutableMapOf返回对象的实际类型是:${mutableMap.javaClass}")

    var hashMap = hashMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
    println(hashMap)

    var linkedHashMap = linkedMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
    println(linkedHashMap)

    var treeMap = sortedMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
    println(treeMap)
}
