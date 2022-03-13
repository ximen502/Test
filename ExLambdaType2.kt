fun <T> test(vararg names: String, transform: (String) -> T): List<T> {
    var mutableList: MutableList<T> = mutableListOf()
    for (name in names) {
        mutableList.add(transform(name))
    }

    return mutableList.toList()
}

fun main(args: Array<String>) {
    var list1 = test("Java", "Python", "Kotlin", "Go") { it.length }
    println(list1)
    var list2 = test("Java", "Python", "Kotlin", "Go") { "Crazy${it}Book" }
    println(list2)
}