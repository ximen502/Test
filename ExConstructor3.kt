//所有的次构造方法都要委托调用初始化块
//no main constructor
class ExConstructor3 {
    var name: String?
    var count: Int

    init {
        println("init block!")
    }

    constructor() {
        name = null
        count = 0
    }

    constructor(name: String, count: Int) {
        this.name = name
        this.count = count
    }
}

fun main(args: Array<String>) {
    var ec1 = ExConstructor3()
    var ec2 = ExConstructor3("Old man and sea", 500000)
    println("${ec1.name} ${ec1.count}")
    println("${ec2.name} ${ec2.count}")
}