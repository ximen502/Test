class NestedOut {
    open class Nested {
        //定义一个嵌套类
        init {
            println("嵌套类的构造方法")
        }
    }
}

fun main(args: Array<String>) {
    val nested: NestedOut.Nested = NestedOut.Nested()
}