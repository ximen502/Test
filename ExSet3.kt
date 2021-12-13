// add,delete element from set
fun main() {
    var languages = mutableSetOf("Swift")
    languages.add("Go")
    languages.add("Lua")
    println(languages)
    println(languages.count())

    languages.addAll(setOf("Java", "Kotlin"))
    println(languages)
}
