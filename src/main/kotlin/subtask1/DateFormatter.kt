package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {
    fun toTextDay(day: String, month: String, year: String): String {
        val formatter = DateTimeFormatter.ofPattern("d MMMM, EEEE", Locale("ru"))
        return try {
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            date.format(formatter)
        } catch (e: DateTimeException) {
            "Такого дня не существует"
        }
    }
}
