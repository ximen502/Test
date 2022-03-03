fun getMathFun(type: String, nn: Int): Int {
    fun square(n: Int): Int {
        return n * n
    }

    fun cube(n: Int): Int {
        return n * n * n
    }

    fun factorial(n: Int): Int {
        var result = 1
        for (index in 2..n) {
            result *= index
        }
        return result
    }

    when (type) {
        "s" -> return square(nn)
        "c" -> return cube(nn)
        else -> return factorial(nn)
    }
}

fun main(args: Array<String>) {
    println(getMathFun("s", 3))
    println(getMathFun("c", 2))
    println(getMathFun("", 5))
}