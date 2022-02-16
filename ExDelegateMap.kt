// 通过Map存储属性值
class Item3(val map: Map<String, Any?>) {
    val barCode: String by map
    val name: String by map
    val price: Double by map
}

fun main(args: Array<String>) {
    val item = Item3(
        mapOf(
            "barCode" to "115222",
            "name" to "Crazy IT",
            "price" to 58.8
        )
    )

    println(item.barCode)
    println(item.name)
    println(item.price)
    println("---------------")
    val map = item.map
    println(map["barCode"])
    println(map["name"])
    println(map["price"])
}