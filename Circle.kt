//为抽象类Shape定义一个子类
class Circle(color: String, var radius: Double) : Shape(color) {
    override fun calPerimeter(): Double {
        return 2 * Math.PI * radius
    }

    override val type: String = "圆形"
}

fun main(args: Array<String>) {
    var s1: Shape = Triangle("黄色", 3.0, 4.0, 5.0)
    var s2: Shape = Circle("黑色", 3.0)
    println(s1.type)
    println(s1.calPerimeter())
    println(s2.type)
    println(s2.calPerimeter())
}