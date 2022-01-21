// final class
// immutable class
//1.提供带参数的构造方法
//2.定义用final修饰的只读属性
//如果有必要，则重写Any类的equals和hashCode方法
// An example class Address

class Address2(val detail: String, val postCode: String) {
    override operator fun equals(other: Any?): Boolean {
        if (this == other) {
            return true
        }
        if (other == null) {
            return false
        }
        if (other.javaClass == Address2::class) {
            var ad = other as Address2
            return this.detail.equals(ad.detail) &&
                    this.postCode.equals(ad.postCode)
        }
        return false
    }

    override fun hashCode(): Int {
        return detail.hashCode() + postCode.hashCode() * 31
    }
}