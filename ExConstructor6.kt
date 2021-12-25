//带有默认值参数的构造方法
class Customer(
    val name: String = "葫芦娃",
    var addr: String = "镇妖山"
)

fun main(args: Array<String>) {
    var ct = Customer(addr = "不周山", name = "共工")
    println(ct.name)
    println(ct.addr)

    var ct2 = Customer()
    println(ct2.name)
    println(ct2.addr)
}