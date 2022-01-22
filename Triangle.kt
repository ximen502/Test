// 为抽象类Shape定义一个子类
class Triangle(
    color: String, var a: Double,
    var b: Double, var c: Double
) : Shape(color) {
    fun setSides(a: Double, b: Double, c: Double) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            println("三角形两边之和必须大于第三边")
            return
        }
        this.a = a
        this.b = b
        this.c = c
    }

    override fun calPerimeter(): Double {
        return a + b + c
    }

    override val type: String = "三角形"
}