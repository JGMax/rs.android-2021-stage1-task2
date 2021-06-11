package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when(blockB) {
            Int::class -> {
                var sum = 0
                blockA.filterIsInstance<Int>().forEach { sum += it }
                sum
            }
            String::class -> {
                var sum = ""
                blockA.filterIsInstance<String>().forEach { sum += it }
                sum
            }
            LocalDate::class -> {
                val maxDate = blockA.filterIsInstance<LocalDate>().max()
                if (maxDate != null) {
                    val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                    maxDate.format(formatter)
                }
                ""
            }
            else -> ""
        }
    }
}
