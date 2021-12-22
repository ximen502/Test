open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4

    protected class Nested {
        public val e: Int = 5
    }
}

class SubClass : Outer() {
    // a can't visit
    // b,c,d visit ok
    // Nested , e visit ok

    override val b = 5
}

class Other(o: Outer) {
    // o.a,o.b can't visit
    // o.c, and other in the same module, so visit ok
    // o.d visit ok
    // Outer.Nested can't visit, Nested::e can't visit
}