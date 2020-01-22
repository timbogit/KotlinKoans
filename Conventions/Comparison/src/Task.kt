data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return (this.year * 366 + this.month * 31 + this.dayOfMonth) -
                (other.year * 366 + other.month * 31 + other.dayOfMonth)
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
