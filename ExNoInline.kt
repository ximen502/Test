inline fun test2(fn1: (Int) -> Int, noinline fn2: (String) -> String) {
    println(fn1(20))
    println(fn2("Kotlin"))
}

fun main(args: Array<String>) {
    test2({ it * it }, { "crazy ${it} book" })
}