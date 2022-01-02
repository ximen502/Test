open class Fruit2 {
    var name: String
    var weight: Double

    constructor(name: String, weight: Double) {
        this.name = name
        this.weight = weight
    }
}

class Apple2 : Fruit2 {
    var color: String

    constructor(name: String, weight: Double, color: String) : super(name, weight) {
        this.color = color
    }
}

class Grape : Fruit2 {
    var sugarRate: Double

    constructor(name: String, weight: Double, sugarRate: Double) : super(name, weight) {
        this.sugarRate = sugarRate
    }
}

fun main(args: Array<String>) {
    var fruits = arrayOf(
        Apple2("山东富士", 1.8, "粉红"),
        Apple2("嘎拉", 2.3, "红色"),
        Grape("吐鲁番", 1.4, 0.23),
        Grape("大泽山", 2.5, 0.35)
    )

    for (f in fruits) {
        var ap = f as? Apple2
        println("${ap?.name}苹果的颜色是${ap?.color}")
    }
}