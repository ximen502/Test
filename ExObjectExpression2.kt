//编译器可识别private修饰的对象表达式的真实类型
class ExObjectExpression2 {
    private val ob1 = object {
        val name: String = "crazy programmer"
    }
    internal val ob2 = object {
        val name: String = "crazy programmer"
    }

    private fun privateBar() = object {
        val name: String = "crazy programmer"
    }

    fun publicBar() = object {
        val name: String = "crazy programmer"
    }

    fun test() {
        println(ob1.name)
        // error can not recognize the obj type because they are not private
        //println(ob2.name)
        println(privateBar().name)
        // error can not recognize the obj type because they are not private
        //println(publicBar().name)
    }
}

fun main(args: Array<String>) {
    ExObjectExpression2().test()
}