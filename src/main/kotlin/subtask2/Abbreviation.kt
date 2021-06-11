package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var mutableA = a
        var i = 0
        while (i < b.length && i < mutableA.length) {
            if (mutableA[i] != b[i]) {
                if (!mutableA[i].isLowerCase()) {
                    return "NO"
                }
                if (mutableA[i].toUpperCase() != b[i]) {
                    val c = mutableA.slice(0 until i) + mutableA.slice(i + 1 until mutableA.length)
                    mutableA = c
                    i--
                }
            }
            i++
        }
        return if (mutableA.length >= b.length) {
            "YES"
        } else {
            "NO"
        }
    }
}

