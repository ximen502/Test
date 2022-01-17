// 这个例子非常重要，Lambda表达式作为带接收者的匿名函数
// 需要注意理解和消化这个例子，非常重要
class HTML {
    fun body() {
        println("<body></body>")
    }

    fun head() {
        println("<head></head>")
    }
}

fun html(init: HTML.() -> Unit) {
    println("<html>")
    val html = HTML()
    html.init()
    println("</html>")
}

fun main(args: Array<String>) {
    html {
        head()
        body()
    }
}