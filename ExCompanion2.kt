//伴生对象的练习，伴生对象支持扩展方法和属性，类型.Companion可访问之,[试了一下，并不能访问啊]
interface Outputable4 {
    fun output(msg: String)
}

class MyClass4 {
    companion object MyCompan : Outputable3 {
        val name = "name属性值"
        override fun output(msg: String) {
            for (i in 1..6) {
                println("<h${i}>${msg}</h${i}>")
            }
        }
    }
}
//下面的代码无法通过编译，可能是kotlin的版本更新不再支持这个功能了
// fun MyClass4.Companion.test(){
//    println("extended method for companion object")
//}
//
//val MyClass4.Companion.foo
//    get() = "extended property for companion object"