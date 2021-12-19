// infix 修饰的函数，类似于将函数定义为运算符，可以像运算符一样使用
// 双目运算符，函数只能有一个参数
class ApplePack(weight: Double) {
    var weight = weight

    override fun toString(): String {
        return "ApplePack(weight=${this.weight})"
    }
}

class Apple(weight: Double) {
    var weight = weight
    override fun toString(): String {
        return "Apple(weight=${this.weight})"
    }

    infix fun add(other: Apple): ApplePack {
        return ApplePack(this.weight + other.weight)
    }

    infix fun drop(other: Apple): Apple {
        this.weight -= other.weight
        return this
    }
}

fun main() {
    var origin = Apple(3.4)

    val ap = origin add Apple(2.6)
    println(ap)

    origin drop Apple(1.5)
    println(origin)
}