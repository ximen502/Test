/**
 * 方法与函数的关系，这个练习和函数章节联系紧密，后续练习函数
 * 在kotlin中函数非常重要，是一种类型，可以定义变量、修饰参数、作为返回值类型，
 * 刷新了我的编码三观。
 */
class Dog {
    // define a run method without param
    // type is ()->Unit
    fun run() {
        println("run method")
    }

    // define a eat method with a String param
    // type is (String)->Unit
    fun eat(food: String) {
        println("正在吃：$food")
    }
}

fun main(args: Array<String>) {
    var rn: (Dog) -> Unit = Dog::run
    val d = Dog()
    rn(d)

    var et = Dog::eat
    et(d, "骨头")
}