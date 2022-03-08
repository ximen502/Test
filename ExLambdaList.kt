var lambdaList = ArrayList<(Int) -> Int>()
fun collectFN(fn: (Int) -> Int) {
    lambdaList.add(fn)
}

fun main(args: Array<String>) {
    collectFN { it * it }
    collectFN { it * it * it }
    println(lambdaList.size)
    for (i in lambdaList.indices) {
        println(lambdaList[i](i + 10))
    }
}