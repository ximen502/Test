//递归函数
fun fn(n: Int): Int {
    if (n == 0) {
        return 1
    } else if (n == 1) {
        return 4
    } else {
        return 2 * fn(n - 1) + fn(n - 2)
    }
}

fun main(args: Array<String>) {
    println("fn(10)的结果是:${fn(2)}")
}