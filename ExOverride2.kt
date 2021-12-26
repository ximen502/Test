open class Bird {
    open fun fly() {
        println("自由飞翔")
    }
}

class Ostrich : Bird() {
    override fun fly() {
        println("鸵鸟飞不起来，只能走或跑")
    }
}

fun main(args: Array<String>) {
    var os = Ostrich()
    os.fly()
}