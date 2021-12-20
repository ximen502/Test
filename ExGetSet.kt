//重写get,set方法的练习
class User(first: String, last: String) {
    var first: String = first
    var last: String = last
    var fullName: String
//        get() {
//            println("execute fullName get() method")
//            return "${first}.${last}"
//        }
        get() = "${first}.${last}"
        set(value) {
            if ("." !in value || value.indexOf(".") != value.lastIndexOf(".")) {
                println("the fullName you input is illegal")
            } else {
                var tokens = value.split(".")
                first = tokens[0]
                last = tokens[1]
            }
        }
}

fun main(args: Array<String>) {
    var user = User("二败", "钱")
//    var user = User("Will", "Smith")
    println(user.fullName)
    user.fullName = "二败.钱"
    println(user.first)
    println(user.last)
}