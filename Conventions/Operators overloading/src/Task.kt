import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate =
        addTimeIntervals(timeInterval, 1)

data class MultipleTimeItervals(val timeInterval: TimeInterval, val numberOfTimes: Int)

operator fun TimeInterval.times(num: Int) = MultipleTimeItervals(this, num)

operator fun MyDate.plus(multipleTimeIntervals: MultipleTimeItervals): MyDate =
        addTimeIntervals(multipleTimeIntervals.timeInterval, multipleTimeIntervals.numberOfTimes)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
