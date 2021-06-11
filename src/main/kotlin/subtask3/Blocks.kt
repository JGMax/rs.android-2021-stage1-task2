package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var sumStr = ""
        var sum = 0
        var maxDate = LocalDate.MIN
        blockA.forEach {
            if (blockB.isInstance(it)) {
                if (it is Int) {
                    sum += it
                } else if (it is String) {
                    sumStr += it
                } else if (it is LocalDate) {
                    if (it.isAfter(maxDate)) {
                        maxDate = it
                    }
                }
            }
        }
        return when {
            blockB.isInstance(maxDate) -> {
                val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                maxDate.format(formatter)
            }
            blockB.isInstance(sum) -> sum
            blockB.isInstance(sumStr) -> sumStr
            else -> ""
        }
    }
}
