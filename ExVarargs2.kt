fun test(vararg books: String, num: Int) {
    for (b in books.indices) {
        println(books[b])
    }
    println(num)
}

fun main(args: Array<String>) {
    test("iOS", "Android", num = 25)
    var arr = arrayOf("Go", "Ruby", "Python", "Zh")
    test(*arr, num = 9)
}