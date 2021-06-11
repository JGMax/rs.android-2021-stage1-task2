package subtask1

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        val toDateParser = SimpleDateFormat("yyyy-MM-dd", Locale("ru", "RU"))
        toDateParser.isLenient = false
        return try {
            val date = toDateParser.parse("$year-${month.dateFormat()}-${day.dateFormat()}")
            SimpleDateFormat("d MMMM, EEEE", Locale("ru", "RU")).format(date)
        } catch (e: ParseException) {
            "Такого дня не существует"
        }
    }

    private fun String.dateFormat() =
        if (toInt() in 0 until 10) {
            "0$this"
        } else {
            this
        }
}
