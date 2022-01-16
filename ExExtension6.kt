//扩展属性
class User2(var first: String, var last: String) {}

var User.fullName: String
    get() = "${first}.${last}"
    set(value) {
        println("执行扩展属性fullName的setter方法")
        // value字符串中不包含.或包含几个.都不行
        if ("." !in value || value.indexOf(".") != value.lastIndexOf(".")) {
            println("您输入的fullName不合法")
        } else {
            var tokens = value.split(".")
            first = tokens[0]
            last = tokens[1]
        }
    }

fun main(args: Array<String>) {
    var user = User("一伤", "赵")
    println(user.fullName)
    user.fullName = "二败.钱"
    println(user.first)
    println(user.last)
}