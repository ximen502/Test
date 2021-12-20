//属性(在定义或构造函数中指定初始值, default support getter,setter)
class Address {
    var street: String = ""
    var city = ""
    var province = ""
    var postCode: String? = null
}

fun main(args: Array<String>) {
    var addr = Address()
    addr.city = "上海"
    addr.street = "霞飞路"

    println(addr.city)
    println(addr.street)

}