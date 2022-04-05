fun main(args: Array<String>) {
    var c = 1
    var sum = 0
    do {
        println(c)
        sum += c
        c++
    } while (c <= 100)
    println(sum)
    println("End do while")
}