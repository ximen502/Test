class Tiger {
    fun foo() {
        println("Tiger类的foo方法")
    }
}

class Bear {
    fun foo() {
        println("Bear类的foo方法")
    }

    fun Tiger.test() {
        foo()// call tiger's foo()
        this@Bear.foo() // this is Stronger than Java
    }

    fun info(tiger: Tiger) {
        tiger.test()
    }
}

fun main(args: Array<String>) {
    val b = Bear()
    b.info(Tiger())
}