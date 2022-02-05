enum class Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

fun main(args: Array<String>) {
    for (s in Season.values()) {
        println(s)
    }
    val seasonName = "SUMMER"
    val s: Season = Season.valueOf(seasonName)
    println(s)
    println(Season.AUTUMN)
}