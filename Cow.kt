class Cow(var weight: Double = 0.0) {
    private inner class CowLeg(var length: Double = 0.0, var color: String = "") {
        fun info() {
            println("当前牛腿的颜色是${color}, 高${length}")
            foo()
        }
    }

    fun test() {
        val cl = CowLeg(1.12, "黑白相间")
        cl.info()
    }

    fun foo() {
        println("Cow's foo method")
    }
}

fun main(args: Array<String>) {
    val cow = Cow()
    cow.test()cp
}