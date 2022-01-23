// 密封类是一种特殊的抽象类，只能在同一个文件中派生子类
sealed class Apple4 {
    abstract fun taste()
}

open class RedFuji : Apple4() {
    override fun taste() {
        println("红富士味道非常好")
    }
}

data class Gala(var weight: Double) : Apple4() {
    override fun taste() {
        println("嘎拉更清脆，重量为${weight}")
    }
}

fun main(args: Array<String>) {
    var ap1 = RedFuji()
    var ap2 = Gala(2.3)
    ap1.taste()
    ap2.taste()
}