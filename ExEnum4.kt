enum class Operation {

    PLUS {
        override fun eval(x: Double, y: Double): Double = x + y
    },
    MINUS {
        override fun eval(x: Double, y: Double): Double = x - y
    },
    TIMES {
        override fun eval(x: Double, y: Double): Double = x * y
    },
    DIVIDE {
        override fun eval(x: Double, y: Double): Double = x / y
    };

    abstract fun eval(x: Double, y: Double): Double
}

fun main(args: Array<String>) {
    println(Operation.PLUS.eval(3.0, 4.0))
    println(Operation.MINUS.eval(3.0, 4.0))
    println(Operation.TIMES.eval(3.0, 4.0))
    println(Operation.DIVIDE.eval(3.0, 4.0))
}