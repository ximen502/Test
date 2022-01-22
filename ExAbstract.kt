abstract class Shape {
    init {
        println("执行Shape的初始化块")
    }

    var color = ""

    // 定义一个计算周长的抽象方法
    abstract fun calPerimetezr(): Double

    // 定义一个代表形状的抽象的只读属性
    // 抽象属性不需要初始值
    abstract val type: String

    constructor() {}
    constructor(color: String) {
        println("执行Shape的构造方法")
        this.color = color
    }
}
/* Shape中包含了初始化块、构造方法，这些都不是创建Shape对象时被调用的，而是在创建子类的实例时被调用 */
/* [抽象类不能用于创建实例，只能当做父类被其子类继承] */