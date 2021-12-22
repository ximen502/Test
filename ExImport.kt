import java.util.Date as UtilDate
import java.sql.Date as SqlDate
//kotlin的import支持as关键 字，指定别名，解决不同包同名类的导入问题
fun main(args: Array<String>) {
    var d = UtilDate()

    var d2 = SqlDate(System.currentTimeMillis())

    println(d)
    println(d2)
}