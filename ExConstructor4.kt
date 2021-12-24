//带主构造方法的主次构造方法示例
//主构造方法带有var/val修饰的参数和不带修饰的参数有什么区别？？？？
class ExConstructor4(name: String) {
    var name: String
    var age: Int
    var info: String? = null

    init {
        println("init block")
        this.name = name
        this.age = 0
    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    constructor(name: String, age: Int, info: String) : this(name, age) {
        this.info = info
    }
}

fun main(args: Array<String>) {
    var ec1 = ExConstructor4("赵一伤")
    var ec2 = ExConstructor4("孙三毁", 38)
    var ec3 = ExConstructor4("李四摧", 38, "箭术超群")
    println("${ec1.name} => ${ec1.age} =>${ec1.info}")
    println("${ec2.name} => ${ec2.age} =>${ec2.info}")
    println("${ec3.name} => ${ec3.age} =>${ec3.info}")
}
/*
创建实例的时候调用主构造方法，主构造方法自动执行初始化块
当程序执行2个次构造方法创建实例的时候，也会先执行初始化块，
这是由于他们都委托了主构造方法的缘故。
*/
//init block
//init block
//init block
//赵一伤 => 0 =>null
//孙三毁 => 38 =>null
//李四摧 => 38 =>箭术超群