import java.math.BigInteger

fun main(args: Array<String>) {
//    FindMissLetter().findMissingLetter(charArrayOf('a', 'b', 'c', 'd', 'f'))
    val float = "2.2f".toFloat()
    SquaresPerimeter().perimeter(5)

}

class KotlKata7 {
}

internal class FindMissLetter{
    fun findMissingLetter(array: CharArray): Char {
        val intArr = array.map { it.toInt() }
        for(i in 0 until intArr.size) {
            val dif = intArr[i] - intArr[i+1]
            if (dif != -1) {
                val miss = (intArr[i] + intArr[i+1])/2
                return miss.toChar()
            }
        }
        return ' '
    }

    fun findMissingLetter2(array: CharArray) = (array.first()..array.last()).first { val b = it !in array
        b
    }
}

internal class SquaresPerimeter{
    fun perimeter(n: Int): BigInteger {
        var square = BigInteger.ZERO
        var nMinTwo = BigInteger.ZERO
        var nMinOne = BigInteger.ONE
        square = nMinOne.multiply(BigInteger.valueOf(4))
        var nBig : BigInteger = BigInteger.ZERO
        for (i in 1 until  n +1) {
            nBig = nMinOne.plus(nMinTwo)
            nMinTwo = nMinOne
            nMinOne = nBig
            square += nBig.multiply(BigInteger.valueOf(4))
        }
        return nBig
    }
}


