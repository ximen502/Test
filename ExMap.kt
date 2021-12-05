fun mT() {
    var map = mapOf("java" to 1, "kotlin" to 2)
    for ((key, value) in map) {
        println("key is $key, value is $value")
    }

    for (i in map.entries) {
        println("${i.key} -> ${i.value}")
    }

    for (i in map.keys) {
        println("$i => ${map[i]}")
    }

    map.forEach { println("${it.key} --> ${it.value}") }
}

fun main() {
    mT()
}
