package subtask1

import java.text.ParseException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {
    fun toTextDay(day: String, month: String, year: String): String {
        val formatter = DateTimeFormatter.ofPattern("d MMMM, EEEE", Locale("ru"))
        val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
        return try {
            date.format(formatter)
        } catch (e: ParseException) {
            "Такого дня не существует"
        }
    }
}
