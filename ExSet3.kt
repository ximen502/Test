private fun exAdd() {
    var languages = mutableSetOf("Swift")
    languages.add("Go")
    languages.add("Lua")
    println(languages)
    println(languages.count())

    languages.addAll(setOf("Java", "Kotlin"))
    println(languages)
}

private fun exDel() {
    var languages = mutableSetOf("Kotlin", "OC", "PHP", "Perl", "Ruby", "Go")
    println(languages)

    languages.remove("PHP")
    languages.remove("Perl")
    println(languages)

    // delete more than one element
    languages.removeAll(setOf("Ruby", "Go"))
    println(languages)

    // clear set
    languages.clear()
    println(languages.count())
}

// add,delete element from set
fun main() {
    exAdd()
    println("-------------------------------")
    exDel()
}
