class DiscernVariable {
    private val prop = "外部类的属性"

    inner class InClass {
        private val prop = "内部类的属性"
        fun info() {
            val prop = "局部变量"
            println("外部类的属性值：${this@DiscernVariable.prop}")
            println("内部类的属性值：${this.prop}")
            println("局部变量的值：${prop}")
        }
    }

    fun test(){
        val ic = InClass()
        ic.info()
    }
}

fun main(args: Array<String>) {
    DiscernVariable().test()
}