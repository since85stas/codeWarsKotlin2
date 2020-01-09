fun main(args: Array<String>) {
//    val str = SpinWords().spinWord("Hey fellow warriors")
//    val b = arrayOf("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
//    val b = arrayOf("")
//    val c = arrayOf("A", "B", "C", "D")
//    val d = Bibliotic().stockSummary(b, c)
//    HighAddLow().highAndLow("1 4 6 7 0 -1")
    DistinctLetters().longest("xyaabbbccccdefww","xxxxyyyyabklmopq")
}

internal class SpinWords {

    private val MAX_LETTERS = 5

    fun spinWord(sentence: String): String {
        val stringSplitted = sentence.split(" ").toMutableList()
        for (i in 0 until stringSplitted.size) {
            if (stringSplitted[i].length >= MAX_LETTERS) {
                val reverseString = stringSplitted[i].reversed()
                stringSplitted[i] = reverseString
            }
        }
        return stringSplitted.reduce({ s1, s2 -> s1 + " " + s2 }).toString()
    }

    fun spinWords(s: String) = s.split(" ").joinToString(" ") { if (it.length > 4) it.reversed() else it }

    fun spinWords2(s: String) = s.split(" ")
            .map { if (it.length > 4) it.reversed() else it }
            .reduceRight({ s1, s2 -> s1 + " " + s2 })
}

internal class Bibliotic {

    fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
        var mapB : MutableMap<String,String> = linkedMapOf()
        if (lstOfCat.size == 0) return ""
        var sumCat: Int = 0
        for (i in 0 until lstOfCat.size) {
            val sum = lstOfArt.filter { it.get(0).toString().toUpperCase() == lstOfCat[i].toUpperCase() }
                    .map { it.split(" ").get(1).toInt() }
                    .sum()
            mapB.put(lstOfCat[i],sum.toString())
        }
        var listStr : MutableList<String> = mutableListOf()
        mapB.forEach{key,value -> listStr.add("($key : $value)")}
        return listStr.reduce{s1,s2 -> s1 +  " - " + s2}
    }

}

internal class HighAddLow{
    fun highAndLow(numbers: String): String {
        val max = numbers.split(" ").map{it.toInt()}.max()
        val min = numbers.split(" ").map{it.toInt()}.min()
        return "$max $min"
    }

    fun highAndLow2(numbers: String): String {
        return numbers.split(" ")
                .map{Integer.parseInt(it)}
                .let{ "${it.max()} ${it.min()}"}
    }
}

internal class DistinctLetters{
    fun longest(s1:String, s2:String):String {
        var resHasMap = hashSetOf<String>()
        resHasMap.addAll(s1.split(""))
        resHasMap.addAll(s2.split(""))
        return resHasMap.sorted().reduce { acc, s -> acc + s  }
    }

    fun longest2(s1:String, s2:String):String {
        return (s1 + s2).toSortedSet().joinToString("")
    }
}