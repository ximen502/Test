//mutable map
fun main() {
    var mutableMap = mutableMapOf("OC" to 96, "PHP" to 3400, "Perl" to 4300, "Ruby" to 5600, "Go" to 5600)
    // [] put key-value
    mutableMap["Swift"] = 9000
    mutableMap.put("OC", 8600)
    println(mutableMap)
    mutableMap.remove("PHP")
    mutableMap.remove("Perl")
    println(mutableMap)
    println(mutableMap.size)
    mutableMap.clear()
    println(mutableMap)
    println(mutableMap.size)
}