fun printTriangle(height: Int = 5, char: Char) {
    for (i in 1..height) {
        for (j in 0 until height - i) {
            print(" ")
        }
        for (j in 0 until 2 * i - 1) {
            print(char)
        }
        println()
    }
}

fun main(args: Array<String>) {
    printTriangle(6, '@')
    printTriangle(7, char = '#')
    printTriangle(char = '*')
}