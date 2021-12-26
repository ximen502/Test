open class Fruit(var weight: Double) {
    fun info() {
        println("I am a fruit! weight is $weight g!")
    }
}
// 继承和重写的练习
class Pear : Fruit(0.0)

fun main(args: Array<String>) {
    var p = Pear()
    p.weight = 56.0
    p.info()
}