fun main(args: Array<String>) {
    val str = SpinWords().spinWord("Hey fellow warriors")
}

internal class SpinWords {

    private val MAX_LETTERS = 5

    fun spinWord(sentence: String) : String{
        val stringSplitted = sentence.split(" ").toMutableList()
        for (i in 0 until stringSplitted.size) {
            if (stringSplitted[i].length >= MAX_LETTERS) {
                val reverseString = stringSplitted[i].reversed()
                stringSplitted[i] = reverseString
            }
        }
        return stringSplitted.reduce({s1,s2 -> s1+ " " + s2}).toString()
    }

    fun spinWords(s: String) = s.split(" ").joinToString(" ") { if (it.length > 4) it.reversed() else it }
}