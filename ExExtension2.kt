fun List<Int>.shuffle(): List<Int> {
    val size = this.size
    var indexArr = Array<Int>(size) { 0 }
    var result: MutableList<Int> = mutableListOf()
    val rand = java.util.Random()
    var i = 0
    outer@ while (i < size) {
        var r = rand.nextInt(size)
        for (j in 0 until i) {
            if (r == indexArr[j]) {
                continue@outer
            }
        }
        indexArr[i] = r
        result.add(this[r])
        i++
    }
    return result.toList()
}

fun main(args: Array<String>) {
    var nums = listOf(20, 30, 100, 34, 67)
    println(nums.shuffle())
    println(nums.shuffle())
}