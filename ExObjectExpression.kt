interface Outputable1 {
    fun output(msg: String)
}

abstract class Product1(var price: Double) {
    abstract val name: String
    abstract fun printInfo()
}

fun main(args: Array<String>) {
    //指定一个父类型的对象表达式
    var ob1 = object : Outputable1 {
        override fun output(msg: String) {
            for (i in 1..6) {
                println("<h${i}>${msg}</h${i}>")
            }
        }
    }
    ob1.output("昆仑山坐忘峰")
    println("-------------------------------------")

    //指定0个父类型的对象表达式
    var ob2 = object {
        //init block
        init {
            println("init block")
        }

        //property
        var name = "Kotlin"

        //method
        fun test() {
            println("test method")
        }

        //只能包含内部类，不能包含嵌套类
        inner class Foo
    }
    println(ob2.name)
    ob2.test()
    println("-------------------------------------")

    //指定2个父类型的对象表达式
    var ob3 = object : Outputable1, Product1(28.8) {
        override fun output(msg: String) {
            println("output:${msg}")
        }

        override val name: String
            get() = "激光打印机"

        override fun printInfo() {
            println("高速激光打印机，支持自动双面打印")
        }
    }
    println(ob3.name)
    ob3.output("Kotlin真不错")
    ob3.printInfo()
}