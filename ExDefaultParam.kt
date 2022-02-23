//形参默认值
fun sayHi(name: String = "孙悟空", message: String = "欢迎来到西牛贺洲") {
    println("${name}, 你好")
    println("消息是：${message}")
}

fun main(args: Array<String>) {
    sayHi()
    sayHi("赵一伤")
    sayHi("钱二败", "欢迎加入神箭八雄")
    sayHi(message = "Welcome to Kingsman, Lancelot")
}