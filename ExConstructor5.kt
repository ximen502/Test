//Kotlin允许在主构造方法上面声明属性，直接在参数之前使用ar或al即可声明属性
class Item(val code: String, var price: Double) {}
//传给该走早期的参数将会赋值给对象的属性

fun main(args: Array<String>) {
    var im = Item("1234567", 6.7)
    println(im.code)
    println(im.price)
}