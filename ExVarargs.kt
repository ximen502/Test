fun test(a: Int, vararg books: String) {
    for (b in books) {
        println(b)
    }
    println(a)
}

fun main(args: Array<String>) {
    test(5, "iOS", "Android")
}