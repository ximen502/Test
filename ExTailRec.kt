// 尾递归函数
// template tail recursive
fun fact(n: Int): Int {
    if (n == 1) {
        return 1
    } else {
        return n * fact(n - 1)
    }
}

//
tailrec fun factRec(n: Int, total: Int = 1): Int =
    if (n==1) total else factRec(n-1, total * n)

fun main(args: Array<String>) {
    println(fact(5))
    println(factRec(5))
}