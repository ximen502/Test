//函数类型可以作为参数
fun map(data: Array<Int>, fn: (Int) -> Int): Array<Int> {
    var result = Array<Int>(data.size) { 0 }
    for (i in data.indices) {
        result[i] = fn(data[i])
    }

    return result
}

fun square(n: Int): Int {
    return n * n
}

fun cube(n: Int): Int {
    return n * n * n
}

fun fact2(n: Int): Int {
    var result = 1
    for (index in 2..n) {
        result *= index
    }
    return result
}

fun main(args: Array<String>) {
    var arr = arrayOf(1, 2, 3, 4, 5)
    println(arr.contentToString())
    println(map(arr, ::square).contentToString())
    println(map(arr, ::cube).contentToString())
    println(map(arr, ::fact2).contentToString())
}