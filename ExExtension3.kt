//先生成List集合所有索引的随机排列，然后再根据索引的随机排列
//去索引List集合中的元素
fun <T> List<T>.shuffle(): List<T> {
    val size = this.size
    var indexArr = Array<Int>(size) { 0 }
    var result: MutableList<T> = mutableListOf()
    var rand = java.util.Random()
    var i = 0
    // 注意这个outer标签的写法，真的是很奇葩，声明的时候at在后
    // 而使用的时候at却是在标签名称的前面，哈哈
    outer@ while (i < size) {
        var r = rand.nextInt(size)
        // 生成一个随机数并且放在一个数组里面，
        // 生成数字后，先检查数组里面是不是已经有这个数字了，如果已经有了，
        // 那么结束本次while循环，再此生成随机数，再比较，i的值是没有变化的，
        // 所以相当于一个死循环，直到生成不重复的随机数为止，程序才会为i变量进行加一
        for (j in 0 until i) {
            if (indexArr[j] == r) {
                continue@outer
            }
        }
        indexArr[i] = r
        i++
        result.add(get(r))// result.add(this[r])，可以替换为这句，都是可以的
    }

    return result.toList()
}