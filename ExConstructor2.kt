// 初始化块就相当于构造方法的执行体
class ExConstructor2(name: String, count: Int) {
    var name: String
    var count: Int

    init {
        this.name = name
        this.count = count
    }
}

fun main(args: Array<String>) {
    // 调用构造方法为属性赋值
    var ec = ExConstructor2("ZhangSan", 100)
    println(ec.name)
    println(ec.count)
}