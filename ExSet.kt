fun ex() {
    var set = setOf("Java", "Kotlin", "Go")
    println(set)

    var mutableSet = mutableSetOf("Java", "Kotlin", "Go")
    println(mutableSet)//
    println("setOf的返回对象的实际类型：${set.javaClass}")
    println("mutableSet的返回对象的实际类型:${mutableSet.javaClass}")

    var hashSet = hashSetOf("Java", "Kotlin", "Go")
    println(hashSet) // 不保证元素的顺序

    var linkedHashSet = linkedSetOf("Java", "Kotlin", "Go")
    println(linkedHashSet) // 集合元素由小到大排序

    var treeSet = sortedSetOf("Java", "Kotlin", "Go")
    println(treeSet) // 集合元素由小到大排序
}

// iterator the set
fun exIt(){
    var set = setOf("紫杉龙王","白眉鹰王","金毛狮王","青翼蝠王")
    for(hero in set){
        println(hero)
    }

    set.forEach { println(it) }
}

fun main() {
    ex()
    exIt()
}
/* kotlin collection exercise: HashSet, LinkedHashSet, TreeSet */

//[Java, Kotlin, Go]
//[Java, Kotlin, Go]
//setOf的返回对象的实际类型：class java.util.LinkedHashSet
//mutableSet的返回对象的实际类型:class java.util.LinkedHashSet
//[Go, Java, Kotlin]
//[Java, Kotlin, Go]
//[Go, Java, Kotlin]
