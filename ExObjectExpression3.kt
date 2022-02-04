fun main(args: Array<String>) {
    var a = 20
    var obj = object {
        fun change() {
            println("change()修改变量a的值")
            a++
        }
    }
    obj.change()
    println(a)
}