//伴生对象的练习，有没有名字区别不大，类型.Companion可访问之
interface Outputable3 {
    fun output(msg: String)
}

class MyClass {
    companion object MyCompan : Outputable3 {
        val name = "name属性值"
        override fun output(msg: String) {
            for (i in 1..6) {
                println("<h${i}>${msg}</h${i}>")
            }
        }
    }
}

class MyClass2 {
    companion object : Outputable3 {
        val name = "name属性值2"
        override fun output(msg: String) {
            for (i in 1..6) {
                println("<h${i}>${msg}</h${i}>")
            }
        }
    }
}

fun main(args: Array<String>) {
    MyClass.output("赵一伤")
    println(MyClass.name)
    MyClass2.output("钱二败")
    println(MyClass2.name)
}