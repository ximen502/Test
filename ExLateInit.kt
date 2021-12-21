import java.util.*

//延迟初始化属性的练习
//延迟初始化属性可以不在定义的时候或构造方法里面赋值。
/*
*延迟初始化属性必须是非空类型
*延迟初始化属性不能是8种基本类型
*延迟初始化属性必须是可变属性,var修饰
*延迟初始化属性不能拥有自定义的get/set方法
*/
class User1 {
    lateinit var name: String
    lateinit var birth: Date
}

fun main(args: Array<String>) {
    var user = User1()
    //Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property name has not been initialized
//    println(user.name)
//    println(user.birth)
    user.name = "孙三毁"
    user.birth = Date()
    println(user.name)
    println(user.birth)
}