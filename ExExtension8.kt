//带接收者的匿名函数【求阶乘的函数】
val factorial = fun Int.(): Int {
    if (this < 0) { // this对象竟然能和数字比较，this代表Int嘛
        return -1
    } else if (this == 1) {
        return 1
    } else {
        var result = 1
        for (i in 1..this) {
            result *= i
        }
        return result
    }
}

fun main(args: Array<String>) {
    println(5.factorial()) // 数字打点调用函数，em...，还能这样？
}