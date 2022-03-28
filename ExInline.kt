inline fun map2(data: Array<Int>, fn: (Int) -> Int): Array<Int> {
    var result = Array<Int>(data.size, { 0 })
    for (i in data.indices) {
        result[i] = fn(data[i])
    }

    return result
}

fun main(args: Array<String>) {
    var arr = arrayOf(10, 20, 30, 40, 50)
    var r = map2(arr, { it + 5 })
    println(r.contentToString())
}