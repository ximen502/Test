import javax.swing.JOptionPane

interface Outputable5 {
    fun output(msg: String)
    var type: String
}

class DefaultOutput : Outputable5 {
    override fun output(msg: String) {
        for (i in 1..6) {
            println("<h${i}>${msg}</h${i}>")
        }
    }

    override var type: String = "output device"
}

class Printer5(b: DefaultOutput) : Outputable5 by b

class Projector() : Outputable5 by DefaultOutput() {
    override fun output(msg: String) {
        JOptionPane.showMessageDialog(null, msg)
    }
}

fun main(args: Array<String>) {
    val output = DefaultOutput()
    var printer = Printer5(output)
    printer.output("KunLun Mountain")
    println(printer.type)
    var projector = Projector()
    projector.output("Mingjiao zong tan")
    println(projector.type)
}