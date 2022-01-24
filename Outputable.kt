// Kotlin的接口里面竟然可以定义具体方法和属性，在Java中是不可以的，
// 但是Java8接口提供了默认方法。但是能定义属性实在是刷新了我的jvm编码三观
interface Outputable {
    val name: String // read only property,not abstract property
        get() = "输出设备"
    val brand: String // abstract property

    var category: String

    fun out()

    fun getData(msg: String)

    fun print(vararg msgs: String) {
        for (msg in msgs) {
            println(msg)
        }
    }

    fun test() {
        println("接口中的test()方法")
    }
}