class MutableItem(val map: MutableMap<String, Any?>) {
    var barCode: String by map
    var name: String by map
    var price: Double by map
}

fun main(args: Array<String>) {
    val item = MutableItem(mutableMapOf())
    item.barCode = "7654321"
    item.name = "九阴真经"
    item.price = 100.5

    println("----------------")

    val map = item.map
    println(map["barCode"])
    println(map["name"])
    println(map["price"])

    map["price"] = 999.88
    println(item.price)
}