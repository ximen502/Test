interface Outputable2 {
    fun output(msg: String)
}

abstract class Product2(var price: Double) {
    abstract val name: String
    abstract fun printInfo()
}
//指定一个父类型的对象声明
object MyOb1: Outputable2 {
    override fun output(msg: String) {
        for (i in 1..6) {
            println("<h${i}>${msg}</h${i}>")
        }
    }
}

//指定0个父类型的对象声明
object MyOb2{
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

    //只能包含嵌套类，不能包含内部类
    class Foo
}

//指定2个父类型的对象声明
object MyOb3: Outputable2, Product2(28.8) {
    override fun output(msg: String) {
        println("output:${msg}")
    }

    override val name: String
        get() = "激光打印机"

    override fun printInfo() {
        println("高速激光打印机，支持自动双面打印")
    }
}

fun main(args: Array<String>) {
    MyOb1.output("昆仑山坐忘峰")
    println("-------------------------------------")

    println(MyOb2.name)
    MyOb2.test()
    println("-------------------------------------")

    println(MyOb3.name)
    MyOb3.output("Kotlin真不错")
    MyOb3.printInfo()
}