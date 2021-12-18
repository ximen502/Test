//this 关键字的练习
class ExThis {
    // define a foo prop
    var foo: Int

    constructor() {
        // define a foo in constructor
        val foo = 0
        // 使用this代表该构造器正在初始化的对象
        // 下面的代码将会把该构造器正在初始化的对象的foo设置为6
        this.foo = 6
    }
}

fun main(args: Array<String>) {
    println(ExThis().foo)
}